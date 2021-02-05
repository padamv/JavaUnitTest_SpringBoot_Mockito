package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeDataServiceStub implements SomeDataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] {1, 2, 3, 4};
    }
}

class SomeDataServiceStub_empty implements SomeDataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] {};
    }
}

class SomeDataServiceStub_oneValue implements SomeDataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] {5};
    }
}

class SomeBusinessImplStubTest {

    @Test
    void calculateSumUsingDataService_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSumUsingDataService_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub_empty());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void calculateSumUsingDataService_oneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub_oneValue());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

}