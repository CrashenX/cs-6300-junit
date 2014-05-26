// Copyright 2014 Jesse J. Cook
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.crashenx.junit.first;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MultiplyTest {

    private int multiplier;

    public MultiplyTest(int testParam) {
        this.multiplier = testParam;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 }, { 5 }, { 121} };
        return Arrays.asList(data);
    }

    @Test
    public void testMultiplyException() {
        Multiply tester = new Multiply();
        assertEquals( "Result"
                    , multiplier * multiplier
                    , tester.multiply(multiplier, multiplier)
                    );
    }

    //@Test(expected = IllegalArgumentException.class)
    //public void testExceptionIsThrown() {
    //    Multiply tester = new Multiply();
    //    tester.multiply(1000, 5);
    //}

    //@Test
    //public void testMultiply() {
    //    Multiply tester = new Multiply();
    //    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
    //}

}
