# Principios SOLID con Java

## S - (Single responsibility principle)
### Principio de de Responsabilidad unica
Solo debe tener una y solo una responsabilidad y solo una razon para cambiar.

<pre>
src/single_principle
</pre>

```java
public class Video {
    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }
}

// -----------

public class VideoDAO {
    public void persist(Video video) throws SQLException {
        String url = "jdbc:mysql://localhost:3000/videos";
        Connection conn = new ConnectionDAO().createConnection();
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO Video (Title, Time, Likes, Views) VALUES (" +
                video.getTitle() + "," +video.getTime() + "," + video.getLikes() + "," +
                video.getViews() + ")";
    }
}

// -----------

public class ConnectionDAO {
    private Connection connection;
    private String url;
    private String user;
    private String dbms;
    private String dbName;
    private String server;
    private String port;

    public ConnectionDAO() {
    }

    public Connection createConnection(){
        // Crea la conexion y la returna
        // basado en las propiedades dadas
        return connection;
    }
}
```

## O - (Open - Closed principle)
### Principio de Abierto y Cerrado
Se basa en que el codigo debe de estar abierto a la extencion, cerrado a la modificacion

<pre>
src/open_closed
</pre>

```java
public interface IEarningsCalculator {
    double calculateEarnings(Video video);
}
// -----------
public class EducationEarningsCalculator implements IEarningsCalculator{
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.013 + video.getViews() * 0.013;
    }
}
// -----------
public class EntertainmentEarningsCalculator implements IEarningsCalculator{
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.011 + video.getViews() * 0.011;
    }
}
// -----------
public class GamingEarningsCalculator implements IEarningsCalculator{
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.012 + video.getViews() * 0.012;
    }
}
```

## L - (Liskov Substitution Principle)
### Principio de sustitusion de Liskov
Se basa en las clases hijas deben poder ser remplazables por las clases padres

<pre>
src/liskov_substitution
</pre>

```java
public class VideoManager {
    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed(){
        return (time / 3600.0) * views;
    }

    public void playRandomAd(){
        System.out.println("play an AD");
    }
}
// -----------
public class PremiumVideo {
    private int premiumId;
    private VideoManager manager;

    public double getNumberOfHoursPlayed(){
        return manager.getNumberOfHoursPlayed();
    }

    public void playRandomAd(){
        manager.playRandomAd();
    }
}
// -----------
public class Video {
    private VideoManager manager;

    public double getNumberOfHoursPlayed(){
        return manager.getNumberOfHoursPlayed();
    }

    public void playRandomAd(){
        manager.playRandomAd();
    }
}
```

## I - (Interface Segregation Principle)
### Principio de segregacion de interfazes
Se basa en que muchas interfazes especificas son mejores que una interfaz general

<pre>
src/interface_segregation
</pre>

```java
public interface IVideoActions {
    double getNumberOfHoursPlayed();
}
// -----------
public interface IAdsActions {
    void playRandomAd();
}
// -----------
public class Video extends VideoManager implements IVideoActions, IAdsActions {
    @Override
    public double getNumberOfHoursPlayed(){
        // todo
    }

    @Override
    public void playRandomAd(){
       // todo
    }
}
// -----------
public class PremiumVideo extends VideoManager implements IVideoActions {
    @Override
    public double getNumberOfHoursPlayed(){
       // todo
    }
}
```

## D - (Dependency Inversion Principle)
### Principio de Inversion de dependencia
Se basa en que debemos de depender de clases abstractas y no de clases concretas

Los modulos de altos nivel no pueden depender de los modulos de bajo nivel, ambos deben de depender de abstracciones

<pre>
src/inversion_dependency
</pre>

```java
public class Service {
    IEarningsCalculator calculator;

    public Service(IEarningsCalculator calculator){
        this.calculator = calculator;
    }

    public double calculateEarnings(Video video){
        return calculator.calculateEarnings(video);
    }
}
```

NOTA: Esto codigo hace referencia al video de youtube de
[Geekific](https://www.youtube.com/watch?v=HoA6aZPR5K0).
Solo esta hecho para aprender como se aplica y practicar en el proceso.

Hare ejemplos a partir de este caso, gracias a [Geekific](https://www.youtube.com/watch?v=HoA6aZPR5K0) he podido entender como funciona y como debo emplearlo.