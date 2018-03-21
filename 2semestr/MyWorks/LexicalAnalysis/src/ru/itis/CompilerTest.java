package ru.itis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CompilerTest {
    private Compiler compiler = new Compiler();

    @Test
    public void testAnalyze(){
        String input = "x3:=5;";
        compiler.analyze(input);

    }

    @Test(expected = SyntaxException.class)
    public void testAnalyzeBad(){
        String input = "x3=5";
        compiler.analyze(input);

    }

    @Test
    public void testProcess() throws InitializeException {
        String input = "x125:=123;x2:=5;x3:=x2+x125;a1:=x3;";
        ArrayList<Variable> arrayList = (ArrayList<Variable>) compiler.process(input);
        String actual = " ";
        for(Variable v: arrayList) {
            actual = actual + v.toString();
        }
        String expected = " x125:=123 x2:=5 x3:=128 a1:=128 ";
        assertEquals(expected, actual);

    }

//    @Test
//    public void testProcess() throws InitializeException {
//        String input = "x1:=123;x2:=5;x3:=x1+x2;";
//        List<Variable> expected = new ArrayList<>();
//        expected.add(new Variable("x1", 123));
//        expected.add(new Variable("x2", 5));
//        expected.add(new Variable("x3", 128));
//
//        List<Variable> actual = compiler.process(input);
//        assertEquals(expected, actual);
//    }
}
