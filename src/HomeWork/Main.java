package HomeWork;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User test = new User("Денис");

        List<User> work = new ArrayList<>();
        work.add(new User("Петр"));
        work.add(new User("Роман"));
        work.add(new User("Евгений"));
        System.out.println("Work " + work);


        userDAO.save(test);

        System.out.println("Without work list "+userDAO.getDataBase());
        userDAO.saveAll(work);
        System.out.println("Save work list "+userDAO.getDataBase());
        userDAO.deleteAll(work);
        System.out.println("Delete work list"+userDAO.getDataBase());
        userDAO.delete(test);
        System.out.println("DataBase without test "+userDAO.getDataBase());


    }
}
