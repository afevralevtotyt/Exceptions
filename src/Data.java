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
        if (login.length() <= 20 && login.length() >= 1) {
            for (int i = 0; i < login.length(); i++) {
                if (loginChars.indexOf(login.toLowerCase().charAt(i)) != -1) {
                } else {
                    throw new WrongLoginException("Неверный логин");
                }
            }

        } else {
            throw new WrongLoginException("Число символов должно быть в диапазоне 1-20");
        } return true;
    }

    public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() <= 20 && password.length() >= 1) {
            for (int i = 0; i < password.length(); i++) {
                if (loginChars.indexOf(password.toLowerCase().charAt(i)) != -1) {
                } else {
                    throw new WrongPasswordException("Неверный пароль");
                }

            }

        } else {
            throw new WrongPasswordException("Число символов поля пароль должно быть 1-20");
        }
        if (confirmPassword.length() <= 20 && confirmPassword.length() >= 1) {
            for (int i = 0; i < confirmPassword.length(); i++) {
                if (loginChars.indexOf(confirmPassword.toLowerCase().charAt(i)) != -1) {
                } else {
                    throw new WrongPasswordException("Неверное подтверждение пароля");
                }
            }

        } else {
            throw new WrongPasswordException("Число символов поля пароль должно быть 1-20");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        } return true;
    }
}
