import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//定义一个类：一张牌
class Card {
    int rank;//数值
    String colour;//花色

    public Card(int rank, String colour) {
        this.rank = rank;
        this.colour = colour;
    }

    @Override
    public String toString() {
        String valurStr=null;
        if (rank == 1) {
            valurStr = "A";
        } else if (rank > 10) {
            if (rank == 11) {
                valurStr = "J";
            } else if (rank == 12) {
                valurStr = "Q";
            } else {
                valurStr = "K";
            }
        } else {
            valurStr=String.valueOf(rank);
        }

        return String.format("[%s & %s]", colour, rank);
    }
}

//定义类：一副牌
class CardDemo{
    //花色
   private static final String[] colours={"♥","♦","♠","♣"};

   //方法  创造一副牌
   //总共生成52张牌（一副），每个花色13张    i代表花色  j代表牌的张数
    public static  List<Card>  creatDeck(){
         List<Card> deck= new ArrayList<>(52);
         for(int i=0;i<4;i++){
             for(int j=0;j<13;j++){
                 String colour=colours[i];
                 int rank=j;
                 Card card=new Card(rank,colour);

                 deck.add(card);
             }
         }
         return  deck;
    }


    //交换牌
    public  static  void swap(List<Card> deck, int i, int j){
        //int tmp = i;   i = j; j = tmp;
        Card tmp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, tmp);
    }

    //洗牌
    public  static void shuffile(List<Card> deck){
        Random rand = new Random(20191130);
        for(int i = deck.size() - 1; i > 0; --i){

            int pos = rand.nextInt(i);
            swap(deck, i, pos);
        }
    }

    //发牌
    public static void send(List<Card> deck, List<List<Card>> persons, int numberCard, int numberPerson) {
        for(int i = 0; i < numberPerson; ++i)
        {
            persons.add(new ArrayList<>());
        }
        for(int i = 0; i < numberCard; ++i)
        {
            for(int j = 0; j < numberPerson; ++j)
            {
                Card card = deck.remove(0);
                persons.get(j).add(card);
            }
        }
    }

}



public class DeckDemo {
    public static void main(String[] args) {
        List<Card> deck=CardDemo.creatDeck();
        System.out.println("初始化一副牌:->");
        System.out.println(deck);

        CardDemo.shuffile(deck);
        System.out.println("随机洗牌后:->");
        System.out.println(deck);

        List<List<Card>>  persons = new ArrayList<>();
        CardDemo.send(deck, persons, 5 , 5);
        System.out.println("发牌后:->");
        System.out.println(persons.get(0));
        System.out.println(persons.get(1));
        System.out.println(persons.get(2));
        System.out.println(persons.get(3));
        System.out.println(persons.get(4));

    }
}
