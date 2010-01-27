package net.sf.sevenzipjbinding.junit.jnitools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import net.sf.sevenzipjbinding.junit.JUnitNativeTestBase;

import org.junit.Test;

public class JNIToolsNativeInterface extends JUnitNativeTestBase {
    public native String testAbstractClass(JTestAbstractClass jTestAbstractClass);

    public native String testInterface1(Interface1 interface1Impl, int offset, boolean fromClass);

    public native JTestFinalClass testJTestFinalClassNewInstance();

    @Test
    public void testFinalClass() {
        JTestFinalClass jTestFinalClass = new JTestFinalClass();
        checkErrorMessage(testAbstractClass(jTestFinalClass));
        assertEquals(1, jTestFinalClass.getPrivateLongMethodParameterI());
        assertEquals(2, jTestFinalClass.getPrivateStringMethodParameterI());
        assertEquals(3, jTestFinalClass.getPrivateVoidMethodParameterI());
        assertEquals(4, jTestFinalClass.getPrivateFinalLongMethodParameterI());
        assertEquals(5, jTestFinalClass.getPrivateFinalStringMethodParameterI());
        assertEquals(6, jTestFinalClass.getPrivateFinalVoidMethodParameterI());
        assertEquals(7, JTestAbstractClass.getPrivateStaticLongMethodParameterI());
        assertEquals(8, JTestAbstractClass.getPrivateStaticStringMethodParameterI());
        assertEquals(9, JTestAbstractClass.getPrivateStaticVoidMethodParameterI());
        assertEquals(10, jTestFinalClass.getProtectedVirtualLongMethodParameterI());
        assertEquals(11, jTestFinalClass.getProtectedVirtualStringMethodParameterI());
        assertEquals(12, jTestFinalClass.getProtectedVirtualVoidMethodParameterI());
        assertEquals(13l, jTestFinalClass.getPrivateLongField());
        assertEquals("14", jTestFinalClass.getPrivateStringField());
        assertEquals(15l, JTestAbstractClass.getPrivateStaticLongField());
        assertEquals("16", JTestAbstractClass.getPrivateStaticStringField());
    }

    @Test
    public void testFinalClassRepeated() {
        JTestFinalClass jTestFinalClass = new JTestFinalClass();
        checkErrorMessage(testAbstractClass(jTestFinalClass));
        assertEquals(1, jTestFinalClass.getPrivateLongMethodParameterI());
        assertEquals(2, jTestFinalClass.getPrivateStringMethodParameterI());
        assertEquals(3, jTestFinalClass.getPrivateVoidMethodParameterI());
        assertEquals(4, jTestFinalClass.getPrivateFinalLongMethodParameterI());
        assertEquals(5, jTestFinalClass.getPrivateFinalStringMethodParameterI());
        assertEquals(6, jTestFinalClass.getPrivateFinalVoidMethodParameterI());
        assertEquals(7, JTestAbstractClass.getPrivateStaticLongMethodParameterI());
        assertEquals(8, JTestAbstractClass.getPrivateStaticStringMethodParameterI());
        assertEquals(9, JTestAbstractClass.getPrivateStaticVoidMethodParameterI());
        assertEquals(10, jTestFinalClass.getProtectedVirtualLongMethodParameterI());
        assertEquals(11, jTestFinalClass.getProtectedVirtualStringMethodParameterI());
        assertEquals(12, jTestFinalClass.getProtectedVirtualVoidMethodParameterI());
        assertEquals(13l, jTestFinalClass.getPrivateLongField());
        assertEquals("14", jTestFinalClass.getPrivateStringField());
        assertEquals(15l, JTestAbstractClass.getPrivateStaticLongField());
        assertEquals("16", JTestAbstractClass.getPrivateStaticStringField());
    }

    @Test
    public void testInterface1Impl1() {
        Interface1Impl1 interface1Impl1 = new Interface1Impl1();
        testInterface1(interface1Impl1, -1, false);
        assertEquals(17, interface1Impl1.getLongMethodParameterI());
        assertEquals(18, interface1Impl1.getStringMethodParameterI());
        assertEquals(19, interface1Impl1.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl1FromClass() {
        Interface1Impl1 interface1Impl1 = new Interface1Impl1();
        testInterface1(interface1Impl1, -1, true);
        assertEquals(17, interface1Impl1.getLongMethodParameterI());
        assertEquals(18, interface1Impl1.getStringMethodParameterI());
        assertEquals(19, interface1Impl1.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl1Repeated() {
        Interface1Impl1 interface1Impl1 = new Interface1Impl1();
        testInterface1(interface1Impl1, -1, false);
        assertEquals(17, interface1Impl1.getLongMethodParameterI());
        assertEquals(18, interface1Impl1.getStringMethodParameterI());
        assertEquals(19, interface1Impl1.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl1RepeatedFromClass() {
        Interface1Impl1 interface1Impl1 = new Interface1Impl1();
        testInterface1(interface1Impl1, -1, true);
        assertEquals(17, interface1Impl1.getLongMethodParameterI());
        assertEquals(18, interface1Impl1.getStringMethodParameterI());
        assertEquals(19, interface1Impl1.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl12() {
        Interface1Impl12 interface1Impl12 = new Interface1Impl12();
        testInterface1(interface1Impl12, -12, false);
        assertEquals(6, interface1Impl12.getLongMethodParameterI());
        assertEquals(17, interface1Impl12.getLongMethodParameterI2());
        assertEquals(7, interface1Impl12.getStringMethodParameterI());
        assertEquals(18, interface1Impl12.getStringMethodParameterI2());
        assertEquals(8, interface1Impl12.getVoidMethodParameterI());
        assertEquals(19, interface1Impl12.getVoidMethodParameterI2());
    }

    @Test
    public void testInterface1Impl12FromClass() {
        Interface1Impl12 interface1Impl12 = new Interface1Impl12();
        testInterface1(interface1Impl12, -12, true);
        assertEquals(6, interface1Impl12.getLongMethodParameterI());
        assertEquals(17, interface1Impl12.getLongMethodParameterI2());
        assertEquals(7, interface1Impl12.getStringMethodParameterI());
        assertEquals(18, interface1Impl12.getStringMethodParameterI2());
        assertEquals(8, interface1Impl12.getVoidMethodParameterI());
        assertEquals(19, interface1Impl12.getVoidMethodParameterI2());
    }

    @Test
    public void testInterface1Impl12Repeated() {
        Interface1Impl12 interface1Impl12 = new Interface1Impl12();
        testInterface1(interface1Impl12, -12, false);
        assertEquals(6, interface1Impl12.getLongMethodParameterI());
        assertEquals(17, interface1Impl12.getLongMethodParameterI2());
        assertEquals(7, interface1Impl12.getStringMethodParameterI());
        assertEquals(18, interface1Impl12.getStringMethodParameterI2());
        assertEquals(8, interface1Impl12.getVoidMethodParameterI());
        assertEquals(19, interface1Impl12.getVoidMethodParameterI2());
    }

    @Test
    public void testInterface1Impl12RepeatedFromClass() {
        Interface1Impl12 interface1Impl12 = new Interface1Impl12();
        testInterface1(interface1Impl12, -12, true);
        assertEquals(6, interface1Impl12.getLongMethodParameterI());
        assertEquals(17, interface1Impl12.getLongMethodParameterI2());
        assertEquals(7, interface1Impl12.getStringMethodParameterI());
        assertEquals(18, interface1Impl12.getStringMethodParameterI2());
        assertEquals(8, interface1Impl12.getVoidMethodParameterI());
        assertEquals(19, interface1Impl12.getVoidMethodParameterI2());
    }

    @Test
    public void testInterface1Impl2() {
        Interface1Impl2 interface1Impl2 = new Interface1Impl2();
        testInterface1(interface1Impl2, -2, false);
        assertEquals(17, interface1Impl2.getLongMethodParameterI());
        assertEquals(18, interface1Impl2.getStringMethodParameterI());
        assertEquals(19, interface1Impl2.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl2FromClass() {
        Interface1Impl2 interface1Impl2 = new Interface1Impl2();
        testInterface1(interface1Impl2, -2, true);
        assertEquals(17, interface1Impl2.getLongMethodParameterI());
        assertEquals(18, interface1Impl2.getStringMethodParameterI());
        assertEquals(19, interface1Impl2.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl2Repeated() {
        Interface1Impl2 interface1Impl2 = new Interface1Impl2();
        testInterface1(interface1Impl2, -2, false);
        assertEquals(17, interface1Impl2.getLongMethodParameterI());
        assertEquals(18, interface1Impl2.getStringMethodParameterI());
        assertEquals(19, interface1Impl2.getVoidMethodParameterI());
    }

    @Test
    public void testInterface1Impl2RepeatedFromClass() {
        Interface1Impl2 interface1Impl2 = new Interface1Impl2();
        testInterface1(interface1Impl2, -2, true);
        assertEquals(17, interface1Impl2.getLongMethodParameterI());
        assertEquals(18, interface1Impl2.getStringMethodParameterI());
        assertEquals(19, interface1Impl2.getVoidMethodParameterI());
    }

    @Test
    public void testJTestFinalClassNewInstance1() {
        JTestFinalClass instance = testJTestFinalClassNewInstance();
        assertNotNull(instance);
        assertEquals(-1, instance.getProtectedVirtualLongMethodParameterI());
        assertEquals(-1, instance.getPrivateVoidMethodParameterI());
        assertEquals(-1, instance.getProtectedVirtualStringMethodParameterI());
    }

    private void checkErrorMessage(String errorMessage) {
        if (errorMessage != null) {
            fail(errorMessage);
        }
    }
}
