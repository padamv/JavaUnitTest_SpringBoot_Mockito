package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class SomeBusinessImplMockTest {

    @Test
    void calculateSumUsingDataService_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        // dataServiceMock retrieveAllData() new int[] {1, 2, 3, 4}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3, 4});


        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSumUsingDataService_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        // dataServiceMock retrieveAllData() new int[] {}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSumUsingDataService_oneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        // dataServiceMock retrieveAllData() new int[] {5}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

}