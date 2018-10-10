package listeners;


import net.dv8tion.jda.core.events.ReadyEvent;

import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event) {
        /*
        TextChannel channel = event.getJDA().getGuildById("475787745801797633").getTextChannelById("485756769000488960");

        for(Emote em : event.getJDA().getGuildById("475787745801797633").getEmotes()) {
            if(em != null) {
                if(em.isAnimated()) {
                    channel.sendMessage("<a:" + em.getName() + ":"  + em.getId() + ">").queue();
                } else {
                    channel.sendMessage("<:" + em.getName() + ":"  + em.getId() + ">").queue();
                }

            } else {
                channel.sendMessage("Emote is null!").queue();
            }
        }

*/
        System.out.println("####################");
        System.out.println("SnapeMoji gestartet!");
        System.out.println("####################");

    }




}
