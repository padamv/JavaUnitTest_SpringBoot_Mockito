package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class SomeBusinessImplMockTest {

    SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @BeforeEach
    public void before(){
        business.setSomeDataService(dataServiceMock);
    }

    @Test
    void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3, 4});
        assertEquals(10, business.calculateSumUsingDataService());
    }

    @Test
    void calculateSumUsingDataService_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    void calculateSumUsingDataService_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        assertEquals(5, business.calculateSumUsingDataService());
    }

}