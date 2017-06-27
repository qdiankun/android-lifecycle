package com.example.lifecyclelog;

/**
 * Created by diankun.qiu on 2017/6/12.
 */

public class StackTraceDemo {

    public static void main(String[] args)
    {
        new StackTraceDemo().methodA();
    }

    private void methodA(){
        System.out.println("------进入methodA----------");
        methodB();
    }

    private void methodB(){
        System.out.println("------进入methodB----------");
        StackTraceElement elements[] = Thread.currentThread().getStackTrace();
        for (int i = 0; i < elements.length; i++) {
            StackTraceElement stackTraceElement=elements[i];
            String className=stackTraceElement.getClassName();
            String methodName=stackTraceElement.getMethodName();
            String fileName=stackTraceElement.getFileName();
            int lineNumber=stackTraceElement.getLineNumber();
            System.out.println("StackTraceElement数组下标 i="+i+",fileName="
                    +fileName+",className="+className+",methodName="+methodName+",lineNumber="+lineNumber);
        }

        System.out.println("=============");
        System.out.println("methodName = "+elements[4].getMethodName());
    }
}
