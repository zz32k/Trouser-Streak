package pwn.noobs.trouserstreak;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pwn.noobs.trouserstreak.commands.*;
import pwn.noobs.trouserstreak.modules.*;


public class Trouser extends MeteorAddon {
        public static final Logger LOG = LoggerFactory.getLogger(Trouser.class);
        public static final Category Main = new Category("TrouserStreak");

        @Override
        public void onInitialize() {
                LOG.info("Initializing PantsMod!");

                Modules.get().add(new AutoLavaCaster());
                Modules.get().add(new AutoMountain());
                Modules.get().add(new AutoStaircase());
                Modules.get().add(new TrouserBuild());
                Modules.get().add(new TrailMaker());
                Modules.get().add(new NewerNewChunks());
                Modules.get().add(new SuperInstaMine());
                Modules.get().add(new BaseFinder());
                Modules.get().add(new Teleport());
                Modules.get().add(new TPFly());
                Modules.get().add(new HandOfGod());
                Modules.get().add(new OPServerKillModule());
                Modules.get().add(new OPplayerTPmodule());
                Modules.get().add(new ExplosionAura());
                Modules.get().add(new ShulkerDupe());
                Modules.get().add(new InvDupeModule());
                Modules.get().add(new InstantKill());
                Modules.get().add(new LecternCrash());
                Modules.get().add(new AutoDrop());
                Modules.get().add(new NbtEditor());
                Modules.get().add(new AnHero());
                Modules.get().add(new RedstoneNuker());
                Modules.get().add(new AirstrikePlus());
                Modules.get().add(new BoomPlus());
                Modules.get().add(new VoiderPlus());
                Modules.get().add(new BetterScaffold());
                Modules.get().add(new BetterAutoSign());
                Modules.get().add(new FlightAntikick());
                Modules.get().add(new BlockListMineCommand());
                Modules.get().add(new AutoCommand());
                Modules.get().add(new AutoScoreboard());
                Commands.add(new LavaTimeCalculator());
                Commands.add(new CasterTimer());
                Commands.add(new NewChunkCounter());
                Commands.add(new BaseFinderCommands());
                Commands.add(new WorldInfoCommand());
                Commands.add(new ViewNbtCommand());
                Commands.add(new AutoVclipCommand());
                Commands.add(new CrashCommand());
        }

        @Override
        public void onRegisterCategories() {
                Modules.registerCategory(Main);
        }

        public String getPackage() {
                return "pwn.noobs.trouserstreak";
        }

}