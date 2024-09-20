package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketWithinStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsSurroundingStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void charactersBeforeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void charactersAfterBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void twoConsecutiveBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void extraOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void leftBracketWithoutRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void rightBracketFollowedByLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void emptyStringInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void unevenNestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

}