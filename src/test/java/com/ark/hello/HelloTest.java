package com.ark.hello;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HelloTest {

    private HelloRepository repo;
    private HelloBoundary boundary;

    @Before
    public void setUp() throws Exception {
        repo = mock(HelloRepository.class);
        boundary = new HelloBoundary(repo);
    }

    @Test
    public void whenAddingANewStringThenRepositoryCalled() {
        //Given
        String someData = "SOME_DATA";

        //When
        boundary.addString(someData);

        //THEN
        verify(repo).add(someData);
    }

    @Test
    public void whenQueryingDataThenRepoIsCalled() {
        //When
        boundary.getLists();

        //Then
        verify(repo).getAllStrings();

    }
}
