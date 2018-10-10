package listeners;

import net.dv8tion.jda.core.entities.Emote;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class ChatListener extends ListenerAdapter {


    public void onMessageReceived(MessageReceivedEvent event) {
        //System.out.println("trigger");
        /*
        if(!event.getAuthor().getId().equalsIgnoreCase("499628066495135771")) {
            List<Emote> givenList = event.getGuild().getEmotes();
            Random rand = new Random();
            Emote randomElement = givenList.get(rand.nextInt(givenList.size()));
            event.getMessage().addReaction(randomElement).queue();
        }*/


        for(Emote em : event.getGuild().getEmotes()) {
            if(event.getMessage().toString().contains("++" + em.getName() + "++")) {
                event.getMessage().delete().queue();
                if(em.isAnimated()) {
                    event.getChannel().sendMessage("<a:" + em.getName() + ":"  + em.getId() + ">").queue();
                } else {
                    event.getChannel().sendMessage("<:" + em.getName() + ":"  + em.getId() + ">").queue();
                }
            }
        }



    }

}
