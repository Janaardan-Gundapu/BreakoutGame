public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GameScene game = new GameScene();
        Scene scene = game.createScene();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Breakout Ball Game");
        primaryStage.show();

        game.startGame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
