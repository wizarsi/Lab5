import java.io.IOException;
/**
 * @author Andrey Vasilev
 * Главный класс, через который программа начинает работу
 */
public class Main {
    public static void main(String[] args) throws IOException{
        CollectionManager collectionManager = new CollectionManager(args[0]);
        Commander commander = new Commander(collectionManager);
        commander.run();
    }
}
