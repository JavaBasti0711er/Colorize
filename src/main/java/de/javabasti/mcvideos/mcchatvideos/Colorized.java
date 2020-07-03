package de.javabasti.mcvideos.mcchatvideos;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

import java.awt.*;
import java.util.Random;

public class Colorized extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        setScoreboard(p);
        e.setJoinMessage(ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + "J"
                + ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + "O"
                + ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + "I"
                + ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + "N"
                + ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + "E"
                + ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + "D" + " "
                + ChatColor.of(lerp(Color.RED, Color.blue, getRangedFloat(1, 0))) + p.getName());

        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {

            int finalr = new Random().nextInt(256);
            int finalg = new Random().nextInt(256);
            int finalb = new Random().nextInt(256);

            int finalr2 = new Random().nextInt(256);
            int finalg2 = new Random().nextInt(256);
            int finalb2 = new Random().nextInt(256);
            String hex = String.format("#%02x%02x%02x", finalr, finalg, finalb);
            String hex2 = String.format("#%02x%02x%02x", finalr2, finalg2, finalb2);
            p.setPlayerListName(ChatColor.of(hex) + "ULTRA+"
                    + ChatColor.of(hex2) + p.getName());
        }, 0L, 40L);

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Bukkit.getScheduler().cancelTasks(this);
    }

    public java.awt.Color lerp(java.awt.Color from, java.awt.Color to, float distance) {
        distance = Math.min(1, Math.max(distance, 0));
        return new java.awt.Color((from.getRed() + (to.getRed() - from.getRed()) * distance) / 255f,
                (from.getBlue() + (to.getBlue() - from.getBlue()) * distance) / 255f,
                (from.getGreen() + (to.getGreen() - from.getGreen()) * distance) / 255f);
    }

    protected static float getRangedFloat(float highest, float lowest) {
        Random rand = new Random();
        float rn = rand.nextFloat();
        if (!(rn > highest || rn < lowest))
            return rn;
        else
            return getRangedFloat(highest, lowest);
    }

    @EventHandler
    public void onCHat(AsyncPlayerChatEvent e) {
        TextComponent component = new TextComponent(e.getMessage());

        int finalr = new Random().nextInt(256);
        int finalg = new Random().nextInt(256);
        int finalb = new Random().nextInt(256);
        String hex = String.format("#%02x%02x%02x", finalr, finalg, finalb);
        component.setColor(ChatColor.of(hex));
        Bukkit.getServer().broadcastMessage(e.getPlayer().getDisplayName() + ": " + component.toLegacyText());
        e.setCancelled(true);
    }



    @SuppressWarnings("deprecation")
    private void setScoreboard(Player p) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();
        final Objective objective = board.registerNewObjective("test", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        objective.setDisplayName(ChatColor.of(lerp(Color.RED, Color.WHITE, getRangedFloat(1, 0))) + "Very"
                + ChatColor.of(lerp(Color.WHITE, Color.LIGHT_GRAY, getRangedFloat(1, 0))) + "Fun");

        Team Space4 = board.registerNewTeam("SPACE4");
        Space4.addEntry("§f");
        objective.getScore("§f").setScore(15);

        Team RANK = board.registerNewTeam("RANK");
        RANK.addEntry("§0");
        objective.getScore("§0").setScore(14);
        Team PROGRESSION = board.registerNewTeam("Progression");
        PROGRESSION.addEntry("§2");
        objective.getScore("§2").setScore(12);
        Team PROGRESSION2 = board.registerNewTeam("Progression2");
        PROGRESSION2.addEntry("§e");
        objective.getScore("§e").setScore(11);

        Team Space3 = board.registerNewTeam("SPACE3");
        Space3.addEntry("§d");
        objective.getScore("§d").setScore(10);

        Team GANG = board.registerNewTeam("GANG");
        GANG.addEntry("§3");
        objective.getScore("§3").setScore(9);
        Team Gang2 = board.registerNewTeam("Gang2");
        Gang2.addEntry("§4");
        objective.getScore("§4").setScore(8);

        Team Space2 = board.registerNewTeam("SPACE2");
        Space2.addEntry("§b");
        objective.getScore("§b").setScore(6);

        Team STATS = board.registerNewTeam("STATS");
        STATS.addEntry("§6");
        objective.getScore("§6").setScore(5);
        Team TOKENS = board.registerNewTeam("Tokens");
        TOKENS.addEntry("§7");
        objective.getScore("§7").setScore(3);

        Team Space = board.registerNewTeam("SPACE");
        Space.addEntry("§9");
        objective.getScore("§9").setScore(1);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {
            int finalr = new Random().nextInt(256);
            int finalg = new Random().nextInt(256);
            int finalb = new Random().nextInt(256);
            int finalr2 = new Random().nextInt(256);
            int finalg2 = new Random().nextInt(256);
            int finalb2 = new Random().nextInt(256);
            int finalr3 = new Random().nextInt(256);
            int finalg3 = new Random().nextInt(256);
            int finalb3 = new Random().nextInt(256);

            int finalr5 = new Random().nextInt(256);
            int finalg5 = new Random().nextInt(256);
            int finalb5 = new Random().nextInt(256);
            int finalr6 = new Random().nextInt(256);
            int finalg6 = new Random().nextInt(256);
            int finalb6 = new Random().nextInt(256);
            String hex = String.format("#%02x%02x%02x", finalr, finalg, finalb);
            String hex2 = String.format("#%02x%02x%02x", finalr2, finalg2, finalb2);
            String hex3 = String.format("#%02x%02x%02x", finalr3, finalg3, finalb3);
            String hex5 = String.format("#%02x%02x%02x", finalr5, finalg5, finalb5);
            String hex6 = String.format("#%02x%02x%02x", finalr6, finalg6, finalb6);
            objective.setDisplayName(ChatColor.of(hex) + "§lVERY"
                    + ChatColor.of(hex3) + "§lFUN");


            RANK.setSuffix(ChatColor.of(hex) + "§lLOTS");
            PROGRESSION.setSuffix(ChatColor.of(hex2) + "» Love:");
            PROGRESSION2.setSuffix(
                    ChatColor.of(hex2) + "  [" + ChatColor.of(hex5) + "============" + ChatColor.of(hex2) + "]" + ChatColor.of(hex2) + " 100%");

            GANG.setSuffix(ChatColor.of(hex) + "§lOF");
            Gang2.setSuffix(ChatColor.of(hex2) + "» Name: " + ChatColor.of(hex3) + "Smasher");
            STATS.setSuffix(ChatColor.of(hex) + "§lFUN");
            TOKENS.setSuffix(ChatColor.of(hex2) + "» Balance: " + ChatColor.of(hex6) + "14,313,131,543");

        }, 0L, 40L);

        p.setScoreboard(board);
    }
}
