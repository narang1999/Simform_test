package com.example.simform_test

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.simform_test.models.DataResponse
import com.example.simform_test.models.Example
import com.example.simform_test.repository.Repository
import com.example.simform_test.view.main.UsersViewModel
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import io.reactivex.Maybe
import org.junit.Before
import org.junit.ClassRule
import org.junit.Rule
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class UserViewModelTest {
    companion object {
        @ClassRule
        @JvmField
        val schedulers = RxImmediateSchedulerRule()
    }

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private lateinit var userViewModelTest:  UsersViewModel

    private val repository = mockk<Repository>(relaxed = true)
    @Before
    fun setUp() {
        userViewModelTest = UsersViewModel(repository)
    }

    // I have written only one case because time constraint
    @Test
    fun `Test on emptylist`() {

        val expectedResult = emptyList<Example>()

        assertThat(userViewModelTest.postData.value).isNullOrEmpty()

        every { repository.getPostData() } returns Maybe.just(DataResponse(expectedResult))

        assertThat(userViewModelTest.postData.value).isNullOrEmpty()

        userViewModelTest.getUsers()

        assertThat(userViewModelTest.postData.value).isEmpty()
    }
}