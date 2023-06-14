
// デコンパイル後のソース

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   SampleVariaboleLengthArg.java

package sample;

public class VariaboleLengthArgDecomp
{

    public VariaboleLengthArgDecomp()
    {
    }

    public void method1(String vals[])
    {
        if(vals.length > 0)
            System.out.println(vals[0]);
        else
            System.out.println("Empty argument");
        if(vals.length > 3)
            System.out.println(vals[3]);
        String as[];
        int j = (as = vals).length;
        for(int i = 0; i < j; i++)
        {
            String value = as[i];
            System.out.println(value);
        }

    }

    public static void main(String args[])
    {
        VariaboleLengthArg sm = new VariaboleLengthArg();
        sm.method1(new String[0]);
        System.out.println("***************************");
        sm.method1(new String[] {
            "abc", "cde", "efg", "hij"
        });
        System.out.println("***************************");
        sm.method1(args);
    }
}

