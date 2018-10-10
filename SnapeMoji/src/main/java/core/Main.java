package core;

import listeners.ChatListener;
import listeners.ReadyListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import utils.Token;

public class Main {

    public static void main(String[] args) {

        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken(Token.token);
        builder.setGame(Game.of(Game.GameType.DEFAULT, "auf SnapeCraft"));
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.addEventListener(new ReadyListener());
        builder.addEventListener(new ChatListener());

        try{
            JDA jda = builder.buildBlocking();
        }catch(Exception e) {
            e.printStackTrace();
        }


    }

}
