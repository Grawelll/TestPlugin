package net.fixer.firstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("god")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                player.setInvulnerable(true);
                player.sendMessage(ChatColor.GREEN + "God mode enabled!");
            }
        }
        return false;
    }
}