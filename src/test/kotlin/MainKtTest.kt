import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commCalc_vkpay() {
        //Arrange
        val card = "VK pay"
        val prevTrans = 0
        val amount = 1000_00
        val expectedValue = 0
        //Act
        val actualValue = commCalc(card, prevTrans, amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun commCalc_mastercard() {
        //Arrange
        val card = "Mastercard"
        val prevTrans = 0
        val amount = 1000_00
        val expectedValue = 0
        //Act
        val actualValue = commCalc(card, prevTrans, amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun commCalc_maestro() {
        //Arrange
        val card = "Maestro"
        val prevTrans = 0
        val amount = 1000_00
        val expectedValue = 0
        //Act
        val actualValue = commCalc(card, prevTrans, amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun commCalc_visa() {
        //Arrange
        val card = "Visa"
        val prevTrans = 0
        val amount = 1000_00
        val expectedValue = 0
        //Act
        val actualValue = commCalc(card, prevTrans, amount)
        //Assert
        assertNotEquals(expectedValue, actualValue)
    }

    @Test
    fun mir() {
        //Arrange
        val card = "Мир"
        val prevTrans = 0
        val amount = 1000_00
        val expectedValue = 0
        //Act
        val actualValue = commCalc(card, prevTrans, amount)
        //Assert
        assertNotEquals(expectedValue, actualValue)
    }

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

    @Test
    fun calcForVisa_calculatedCommission() {
        //Arrange
        val amount = 10000_00
        val expectedValue = 7500
        //Act
        val actualValue = calcForVisa(amount)
        //Assert
        assertEquals(expectedValue, actualValue)
    }
}