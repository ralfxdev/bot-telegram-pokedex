package umg.pgm2;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import umg.pgm2.botTelegram.Bot;
import umg.pgm2.botTelegram.PokemonBot;

public class Main {
    public static void main(String[] args) {
        try{
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            //Bot mibot = new Bot();
            PokemonBot pokedex = new PokemonBot();
            botsApi.registerBot(pokedex);
            System.out.println("/pokemon");
            System.out.println("Bot registered!");
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}