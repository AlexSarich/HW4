import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcForM_previousTransitionMoreThan75000() {
        //Arrange
        val prevTrans = 80000_00
        val amount = 1000_00
        val expectedValue = 2600
        //Act
        val actualValue = calcForM(prevTrans, amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun calcForM_previousTransitionLessThan75000() {
        //Arrange
        val prevTrans = 70000_00
        val amount = 1000_00
        val expectedValue = 0
        //Act
        val actualValue = calcForM(prevTrans, amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun calcForVisa_minimalCommission() {
        //Arrange
        val amount = 1000_00
        val expectedValue = 3500
        //Act
        val actualValue = calcForVisa(amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }
}