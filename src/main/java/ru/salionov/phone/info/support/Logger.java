package ru.salionov.phone.info.support;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class Logger {
    /**
     *
     * @param message
     * @param args
     */
    public static void trace(String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).trace(format(message, args));
    }

    /**
     *
     * @param message
     * @param args
     */
    public static void debug(String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).debug(format(message, args));
    }

    /**
     *
     * @param e
     * @param message
     * @param args
     */
    public static void debug(Throwable e, String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).debug(format(message, args), e);
    }


    /**
     *
     * @param message
     * @param args
     */
    public static void info(String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).info(format(message, args));
    }

    /**
     *
     * @param e
     * @param message
     * @param args
     */
    public static void info(Throwable e, String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).info(format(message, args), e);
    }

    /**
     *
     * @param message
     * @param args
     */
    public static void warn(String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).warn(format(message, args));
    }

    /**
     *
     * @param e
     * @param message
     * @param args
     */
    public static void warn(Throwable e, String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).warn(format(message, args), e);
    }

    /**
     *
     * @param message
     * @param args
     */
    public static void error(String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).error(format(message, args));
    }

    /**
     *
     * @param e
     * @param message
     * @param args
     */
    public static void error(Throwable e, String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).error(format(message, args), e);
    }

    /**
     *
     * @param message
     * @param args
     */
    public static void fatal(String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).fatal(format(message, args));
    }

    /**
     *
     * @param e
     * @param message
     * @param args
     */
    public static void fatal(Throwable e, String message, Object... args){
        org.apache.log4j.Logger.getLogger(getCallerClassName()).fatal(format(message, args), e);
    }


    /**
     * @return the className of the class actually logging the message
     */
    static String getCallerClassName() {
        final int level = 5;
        return getCallerClassName(level);
    }

    /**
     * @return the className of the class actually logging the message
     */
    static String getCallerClassName(final int level) {
        CallInfo ci = getCallerInformations(level);
        return ci.className;
    }

    /**
     * Examine stack trace to get caller
     * @param level method stack depth
     * @return who called the logger
     */
    static CallInfo getCallerInformations(int level) {
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        StackTraceElement caller = callStack[level];
        return new CallInfo(caller.getClassName(), caller.getMethodName());
    }


    static class CallInfo {

        public String className;
        public String methodName;

        public CallInfo() {
        }

        public CallInfo(String className, String methodName) {
            this.className = className;
            this.methodName = methodName;
        }
    }

    /**
     * Try to format messages using java Formatter.
     * Fall back to the plain message if error.
     */
    static String format(String msg, Object... args) {
        try {
            if (args != null && args.length > 0) {
                return String.format(msg, args);
            }
            return msg;
        } catch (Exception e) {
            return msg;
        }
    }
}
