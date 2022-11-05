public class Data {
    public static String loginChars = "abcdefghijklmnopqrstuvwxyz0123456789_";

    public static boolean checkLoginPass(String login, String password, String confirmPassword)  {
        int checked = 0;
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
      }
        return false;
    }

    public static boolean checkLogin(String login) throws WrongLoginException {
        if (checkLength(login)) {
           checkSymbolLogin(login);
            return true; } else {
        return false;}}



    public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (checkLength(password)) {
            checkSymbolPass(password);
            }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        } return true;
    }
    public static boolean checkLength(String str){
        if(str.length() <= 20 && str.length() >= 1){
            return true;
        }else {return false;}}


        public static void checkSymbolLogin(String str) throws WrongLoginException{
            for (int i = 0; i < str.length(); i++) {
                if (loginChars.indexOf(str.toLowerCase().charAt(i)) != -1) {
                } else {
                    throw new WrongLoginException("Неверный логин");
                }

            }
        }

    public static void checkSymbolPass(String str) throws WrongPasswordException{
        for (int i = 0; i < str.length(); i++) {
            if (loginChars.indexOf(str.toLowerCase().charAt(i)) != -1) {
            } else {
                throw new WrongPasswordException("Неверный пароль");
            }

        }
    }
    }
