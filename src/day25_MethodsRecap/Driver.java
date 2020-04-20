package day25_MethodsRecap;
/*
Warm up tasks:
	1. write a return method named getDriver1 that accepts a string parameter called Browser
			if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver

				Ex: getDriver("chrome");  ==> "Chrome Driver"
					getDriver("fireFOX"); ==> "FireFox Driver"
						....

			if the browser name does not match with any of browsers above, the method should return "Invalid"

			APPLY SWITCH STATEMENTS


	2. do the first task with multi-branch if statement instead of switch statement

	3. do the first task with ternaries instead of switch statements
 */
public class Driver {

/*
method decleration:
		Access-modifers  Specifier  return-Type  MethodName(paramter){
				statements;
		}
 */

    public static void main(String[] args) {
      //  getDriver1(); //argument is mandatory

       String str = getDriver1("Cybertek"); // FIREFOX



    }


    public static String getDriver1(String browserName){

            String result = "";
// fire fox ==>firefox
            switch (browserName.toLowerCase()){  // "ChromE".toLowerCase() ==> chrome
                case "chrome": result = "Chrome Driver";
                                break;

                case "firefox": result = "Firefox Driver";
                                break;

                case "safari": result = "Safari Driver";
                                break;

                case "opera": result = "Opera Driver";
                                break;

                case "edge": result = "Edge Driver";
                                break;

                default: result = "Invalid Driver";
            }

        System.out.println(result);

            return result;
    }



}
