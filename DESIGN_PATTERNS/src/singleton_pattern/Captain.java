package singleton_pattern;

/*

    DOUBLE-CHECKED LOCKING

    Synchronization is only needed for the initial threads that
    try to create an instance, once it is done the synchronization
    is no longer needed as any call to the getInstance will henceforth
    return an instance that already exists.
    So no need to keep blocking other threads from accessing the
    getInstance() as we are only trying to not allow concurrent creation
    of the instance.The synchronized block will just focus on the initialization
    of instance.If it doesn't matter whether the getInstance method is thread-safe or not
    you can as well leave it bare.
 */

public class Captain {
    private static Captain captain;

    private Captain() {
    }

    public static Captain getInstance() {

        if (captain == null) {

            synchronized (Captain.class) {
                captain = new Captain();

            }
        }

        return captain;
    }

}



/*


    EAGER INITIALIZATION
    is thread-safe by default
    but could slow down the application as the initial
    expensive process of initializing the instance is being
    executed

 */
//public class Captain {
//    private static final Captain captain = new Captain();
//
//    private Captain() {
//    }
//
//    public static Captain getInstance() {
//        return captain;
//    }
//}

//public class Captain {
//    private static Captain captain;
//
//    private Captain() {
//    }
//
//    public static Captain getInstance() {
//
//        //Lazy Initialization;
//        if (captain == null) {
//            captain = new Captain();
//        }
//
//        return captain;
//    }
///*
//// Making the instance creation thread-safe
//
//    public static synchronized Captain getInstance() {
//
//        //Lazy Initialization;
//        if (captain == null) {
//            captain = new Captain();
//        }
//
//        return captain;
//    }
//
// */
//}
