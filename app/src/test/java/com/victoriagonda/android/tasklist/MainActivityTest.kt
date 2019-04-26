package com.victoriagonda.android.tasklist

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.content.pm.ApplicationInfoBuilder
import androidx.test.core.content.pm.PackageInfoBuilder
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.getIntents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.truth.content.IntentSubject
import androidx.test.ext.truth.content.IntentSubject.assertThat
import androidx.test.ext.truth.os.BundleSubject
import com.google.common.truth.IntegerSubject
import com.victoriagonda.android.tasklist.app.App
import com.victoriagonda.android.tasklist.persistance.Repository
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.inject
import org.koin.test.mock.declareMock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

@RunWith(AndroidJUnit4::class)
class MainActivityTest : KoinTest {

  private val mockRepository: Repository by inject()

  private val testModule = module(override = true) {
    single<Repository>(override = true) { mock(Repository::class.java) }
    viewModel { MainViewModel(get()) }
  }

  @Before
  fun setUp() {
    loadKoinModules(testModule)
    declareMock<Repository>()
    `when`(mockRepository.getTasklists())
        .thenReturn(MutableLiveData<List<Tasklist>>()
            .apply { value = listOf(Tasklist("Dishes", listOf(), 1)) })
  }

//  @get:Rule
//  val activityRule =
//      ActivityScenarioRule(MainActivity::class.java)

  @Test
  fun mainActivityLaunches() {
    ActivityScenario.launch(MainActivity::class.java)
  }

  @Test
  fun showOtherFunctions() {
    val scenario =
//        activityRule.scenario
        ActivityScenario.launch(MainActivity::class.java)
    scenario.moveToState(Lifecycle.State.CREATED)
    scenario.moveToState(Lifecycle.State.RESUMED)

    scenario.recreate()
    scenario.close()

    val applicationInfo = ApplicationInfoBuilder.newBuilder()
        .setPackageName("com.victoriagonda.tasklist")
        .build()
    PackageInfoBuilder.newBuilder()
        .setApplicationInfo(applicationInfo)
        .setPackageName("com.victoriagonda.tasklist")
        .build()

    val context =
        ApplicationProvider.getApplicationContext<App>()
    val appName = context.getString(R.string.app_name)

//    val fragmentScenario = FragmentScenario.launch(
//        TestFragment::class.java, fragmentArgs =  Bundle())
//    fragmentScenario.moveToState(Lifecycle.State.RESUMED)
//
//    var arguments: Bundle? = null
//
//    fragmentScenario.onFragment { fragment ->
//      arguments = fragment.arguments
//    }
  }

  @Test
  fun mainActivityShowsAddButton() {
    val scenario = ActivityScenario.launch(MainActivity::class.java)

    onView(withId(R.id.buttonAddList))
        .check(matches(isDisplayed()))
  }

  @Test
  fun selectingListOpensDetailActivity() {
    ActivityScenario.launch(MainActivity::class.java)
    Intents.init()
    onView(withId(R.id.recyclerView))
        .perform(RecyclerViewActions
            .actionOnItemAtPosition<TaskListViewHolder>(0, click()))

    Intents.intended(IntentMatchers
        .hasComponent(DetailActivity::class.java.name))

    Intents.release()
  }

  @Test
  fun selectingListOpensDetailActivityUsingTruth() {
    ActivityScenario.launch(MainActivity::class.java)
    Intents.init()
    onView(withId(R.id.recyclerView))
        .perform(RecyclerViewActions
            .actionOnItemAtPosition<TaskListViewHolder>(0, click()))

    val intent = getIntents().first()
    IntentSubject.assertThat(intent)
        .hasComponentClass(DetailActivity::class.java)
    Intents.release()
  }

  @Test
  fun testIntentBuilding() {
    val tasklist = Tasklist("Laundry", listOf(), 4)

    val intent = DetailActivity.newIntent(tasklist,
        ApplicationProvider.getApplicationContext())

    val bundleSubject: BundleSubject =
        assertThat(intent).extras()
    bundleSubject.containsKey("EXTRA_TASKLIST")
    val integerSubject: IntegerSubject = bundleSubject.integer("EXTRA_TASKLIST")
    integerSubject.isEqualTo(tasklist.id)

    assertEquals(4, 5)
  }
}