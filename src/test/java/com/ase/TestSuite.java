package com.ase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jayavardhanpatil on 10/30/19
 */


@RunWith(Suite.class)

@Suite.SuiteClasses({AdditionTest.class, DivisionTest.class, ModulusTest.class,
        MultiplicationTest.class, SubtractionTest.class, UnSupportedOperationTest.class
})
public class TestSuite {
}
