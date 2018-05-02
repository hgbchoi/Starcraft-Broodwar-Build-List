package com.example.billy.starcraftbroodwarbuildlist.Database;

import android.content.Context;

import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;
import com.example.billy.starcraftbroodwarbuildlist.R;

import java.util.ArrayList;
import java.util.List;


public class BuildData {

    Context context;
    public Builds ThreeDragoonDoubleNexus;
    public Builds WalkingReaver;
    public Builds Overpool;
    public Builds RawDoubleNexus;
    public Builds FD;
    public Builds TwoFactory;
    public Builds FastEB;
    public Builds TwoGateRobotics;
    public Builds DarkTemplarDoubleNexus;
    public Builds FastDarkTemplar;
    public Builds T1DoubleNexus;
    public Builds Fifteen2Gate;
    public Builds UpgradeTerran;
    public Builds TwoBarracksAcademy;
    public Builds TwoGateZealotPush;
    public Builds BBS;
    public Builds TwentyOneTwoGate;
    public Builds FastExpandThreeGateway;
    public Builds RoboThreeGate;
    public Builds CorsairSpeedUpZealot;
    public Builds ReaverOffensive;
    public Builds SpeedShuttle;
    public Builds PowerDragoon;
    public Builds PvZTips;
    public Builds PvZCenter99Gate;
    public Builds OneFactoryStarport;
    public Builds ReaperDarkTemplar;
    public Builds BarrackDouble;
    public Builds FactoryDouble;
    public Builds OneOneOne;
    public Builds FiveBarrack;
    public Builds FactoryDoubleTvT;
    public Builds BarrackDoubleTvT;
    public Builds BBSTvT;
    public Builds TwoStarWraith;
    public Builds TvTNotes;
    public Builds TwelveHatchery;
    public Builds NineDrone;
    public Builds OverpoolvZ;
    public Builds FastGas;
    public Builds TwelvePool;
    public Builds TwelveHatcheryvZ;
    public Builds ZvZTips;
    Builds NineDroneSpeedvP;
    Builds NineSevenThree;
    Builds NineDronevT;
    Builds NineDroneSpeed;
    Builds OverpoolvT;
    Builds TwelveHatchvT;
    Builds NoSpawning3Hatch;
    Builds TwoHatchMuta;
    Builds TwoHatchLurker;
    Builds ThreeHatch;
    Builds TwoHatcheryHydra;

    private String STANDARD_TOSS_OPENING = "8 -> Pylon\n" +
            "10 -> Gateway\n" +
            "12 -> Gas\n" +
            "13 -> Cybernetics Core\n" +
            "14 -> Zealot\n" +
            "16 -> Pylon\n" +
            "17 -> Dragoon, Dragoon Range\n";

    private String STANDARD_TERRAN_OPENING = "\"9 -> Supply Depot\n" +
            "12 -> Barracks\n" +
            "12 -> Gas\n" +
            "15 -> Supply Depot\n";

    private String STANDARD_TOSS_OPENING_vT = "8 -> Pylon\n" +
            "10 -> Gateway\n" +
            "12 -> Gas\n" +
            "13 -> Cybernetics Core\n" +
            "14 -> Dragoon, Dragoon Range\n" +
            "16 -> Pylon\n";

    private String STANDARD_TOSS_OPENING_vZ = "8 -> Pylon at expo\n" +
            "12 -> Forge, Scout\n" +
            "13 -> Cannon\n" +
            "13 -> Nexus at expo\n" +
            "15 -> Gateway at expo\n" +
            "16 -> Pylon, Gas\n" +
            "100% Gateway -> Cybernetics Core\n";

    public BuildData (Context context){

        this.context = context;

    }


    public List<Builds> getBuildsAndputToList() {

        List<Builds> myBuildList = new ArrayList<>();
        //Builds(Name, Race, Build Order, Build Notes);

        //P v P
        WalkingReaver = new Builds((String) context.getText(R.string.WalkingReaver_BuildName), (String) context.getText(R.string.WalkingReaver_BuildRace),  (String) context.getText(R.string.WalkingReaver_BuildOrder), (String) context.getText(R.string.WalkingReaver_BuildNotes));
        TwoGateZealotPush = new Builds("Two Gate Zealot Rush", "P v P", "7 -> Pylon\n9 -> Gateway x 2, Scout\nDon't get supply blocked\nKeep producing Zealots and put pressure on opponent", "If your opponent is not expecting this 2 Gateway push, he will probably have 1 Zealot, 1 Dragoon when your 3 Zealots arrive at the enemy base. Put 2 of your Zealots to fight with the enemy units and pull 1 Zealot to attack the probes mining minerals. If you do sufficient damage, however fail to finish the game off, you should tech up, and brace yourself for mid-late game.");
        FastExpandThreeGateway = new Builds("Fast Expand Three Gateway", "P v P", "8 -> Pylon\n10 -> Gateway\n12 -> Gas\n13 -> Cybernetics Core\n14 -> Zealot\n16 -> Pylon\n17 -> Dragoon, Dragoon Range\nKeep Dragoon + Probe Production\n28 Nexus (~ 3 Dragoons)\n30 -> Gateway x 2\n~50 -> Robotics Facility", "This is a very good build against anything else other than Dark Templars. You can out macro your opponents that went for an early Robotics Facility and gain a huge advantage. If your opponents is a 3 Gateway all in, remain calm, fight with Probes + Dragoon and you will be able to stop the rush");
        TwentyOneTwoGate = new Builds("21 Two Gateway", "P v P", "8 -> Pylon\n10 -> Gateway\n 12 -> Gas\n 13 -> Cybernetics Core\n14 -> Zealot\n16 -> Pylon\n17 -> Dragoon, Dragoon Range\n21 -> Gateway\n~29 -> Robotics Facility (~ 4 Dragoons)", "This build is some what dangerous against early Dark Templars, the goal is to put pressure on the opponents with fast 1 Zealot 4 Dragoons. After the pressure, you can choose to either go Reavers, or Expand depending on your opponent's build"  );
        RoboThreeGate = new Builds("Robotics 3 Gate", "P v P", STANDARD_TOSS_OPENING + "25 -> Robotics Facility\n28 -> Gateway x 2", "This build is very good against Dark Templars due to having fast Observers while having a lot of Dragoons. With the high number of Dragoons, you can put pressure on the enemy Toss early game. This build however is bad against an early expanding build such as the 'Fast Expand Three Gateway' due to the number of Dragoons stacking up a bit later than necessary");
        ReaverOffensive = new Builds("Offensive Reaver", "P v P", STANDARD_TOSS_OPENING + "Keep Dragoon, Probe Production\n30 -> Gateway, Robotics Facility\n100% Robotics Facility -> Shuttle, Reaver\nPush out with 1 Shuttle, Reaver and Dragoons", "Very aggressive build, weak against early Dark Templars. If your opponent has too many Dragoons (3 Gateway), you can pretend to push and then drop the Reaver in your opponent's main base. Keep producing Reavers to depend opponent's all in afterwords.");
        SpeedShuttle = new Builds("Speed Up Shuttle", "P v P", "8 -> Pylon\n" + "10 -> Gateway\n" + "12 -> Gas\n" + "13 -> Cybernetics Core\n" + "14 -> Zealot\n" + "16 -> Pylon\n17 -> Dragoon\n21 -> Pylon\n22 -> Dragoon\n25 -> Robotics Facility\n26 -> Dragoon\n29 -> Zealot, Pylon\n100% Robotics Facility -> Shuttle, Observatory, Robotics Support Bay\nShuttle Speed Upgrade\nReaver", "Near the completion of the Shuttle speed upgrade, leave the base with the shuttle with 2 Zealots, Reaver inside, build 2 more Gateways + Dragoon range upgrade for defence. If the opponent is ready for your shuttle with Dragoons in his main base, don't force yourself to do damage. If your Reaver dies, you may lose to the opponent's attack.");
        DarkTemplarDoubleNexus = new Builds((String) context.getText(R.string.DarkTemplarExpand_BuildName), (String) context.getText(R.string.DarkTemplarExpand_BuildRace),(String) context.getText(R.string.DarkTemplarExpand_BuildOrder), (String) context.getText(R.string.DarkTemplarExpand_BuildNotes));
        myBuildList.add(SpeedShuttle);
        myBuildList.add(ReaverOffensive);
        myBuildList.add(TwoGateZealotPush);
        myBuildList.add(FastExpandThreeGateway);
        myBuildList.add(TwentyOneTwoGate);
        myBuildList.add(DarkTemplarDoubleNexus);
        myBuildList.add(RoboThreeGate);
        myBuildList.add(WalkingReaver);

        //P v T
        FastDarkTemplar = new Builds("Super Fast Dark Templar", "P v T", "7 -> Pylon\n9 -> Gateway\n10 -> Gas\n12 -> Cybernetics Core, Zealot\n~14 -> Send Probe to middle of the map\n15 -> Pylon in center\n100% Cybernetics Core -> Citadel of Adun\n100% Citadel of Adun -> Templar Archive, 2 Gateways at center\n100% Templar Archive -> Dark Templar x 3", "This is a very strong early game finisher against any Terran build, however you cannot get scouted so make sure to only use this build on a map that you can block the enterance with a single Zealot. With this build you should be able to have 3 DTs reach the opponent base at around the 5 minute mark. If the enemy has vultures, make sure you separate the DTs out so you don't get mine splash damage. Focus on chopping the mines off as soon as they are planted.");
        RawDoubleNexus = new Builds("12 Nexus (Defensive)", "P v T", "8 -> Pylon\n12 -> Nexus at expo, Gateway\n14 -> Gas\n15 -> Stop probe production, Zealot, Cybernetics Core\n17 -> Gateway\n21 -> Dragoon, Dragoon Range", "The point of this build is to force the Terran to cheese you and counter it by your fast first Zealot. With the first Zealot, head out immediately towards your opposing terran to slow down the cheese rush. Your goal is to have Dragoons out before the cheese arrives for easy defending. If your opponent does not cheese you, go for observers as usual and prep for mid-late game");
        T1DoubleNexus = new Builds ((String) context.getText(R.string.T1Double_BuildName), (String) context.getText(R.string.T1Double_BuildRace),(String) context.getText(R.string.T1Double_BuildOrder), (String) context.getText(R.string.T1Double_BuildNotes));
        TwoGateRobotics = new Builds((String) context.getText(R.string.TwoGateRobotics_BuildName), (String) context.getText(R.string.TwoGateRobotics_BuildRace),(String) context.getText(R.string.TwoGateRobotics_BuildOrder), (String) context.getText(R.string.TwoGateRobotics_BuildNotes));
        Fifteen2Gate = new Builds((String) context.getText(R.string.Fifteen2Gateway_BuildName), (String) context.getText(R.string.Fifteen2Gateway_BuildRace),(String) context.getText(R.string.Fifteen2Gateway_BuildOrder), (String) context.getText(R.string.Fifteen2Gateway_BuildNotes));
        ThreeDragoonDoubleNexus = new Builds((String) context.getText(R.string.ThreeDragoonDoubleNexus_BuildName), (String) context.getText(R.string.ThreeDragoonDoubleNexus_BuildRace),  (String) context.getText(R.string.ThreeDragoonDoubleNexus_BuildOrder), (String) context.getText(R.string.ThreeDragoonDoubleNexus_BuildNotes));
        myBuildList.add(RawDoubleNexus);
        myBuildList.add(FastDarkTemplar);
        myBuildList.add(ThreeDragoonDoubleNexus);
        myBuildList.add(TwoGateRobotics);
        myBuildList.add(Fifteen2Gate);
        myBuildList.add(T1DoubleNexus);

        //P v Z
        PowerDragoon = new Builds ("Power Dragoon", "P v Z", STANDARD_TOSS_OPENING_vZ+"100% Gateway -> Cybernetics Core, Zealot\n100% Zealot -> Dragoon, Dragoon Range\n~33 -> Ground Weapons Upgrade\n~37 -> Gateway x 4\nContinue Dragoon production for all Gateways\n100% Dragoon Range Upgrade -> Push out with Dragoons", "It is important that your opponent does not know what you are doing, if there is an Overlord in your base, kill it with your first Dragoon. If your opponent is playing very defensively with more than 3 Sunken Colonies, back off, expand, tech up");
        CorsairSpeedUpZealot = new Builds ("Corsair + Speed Up Zealot", "P v Z", STANDARD_TOSS_OPENING_vZ + "100% Cybernetics Core -> Stargate, Citadel of Adun, Gas at expo\nGround Weapons Upgrade, Air Weapons Upgrade, Zealot Speed Upgrade\n@100% Stargate -> Start Producing Corsairs\nGateway x 2~4\nKeep producing Zealots with ~6 Corsairs, Push out when Zealot Speed up is near completion\nTemplar Archive or Robotics Facility depending on the situation","This is a standard P v Z build, tanking with Zealots while ripping Overlords with the early~mid game rush. If your opponent goes Mutas, you can easily counter this with your +1 Upgraded Corsairs. If your opponent is producing Hydras, go for a Templar Archive after the rush to get Psi Storms to counter.");
        PvZTips = new Builds("P v Z Early Game Tips", "P v Z","8 -> Pylon at Expo, Scout\nIf you scout your opponent at first try, and he is not building his Spawning Pool (e, g 12 -> Hatchery), Harass opponent so he cannot build his Hatchery at expo whilst building your own expansion (before Forge)\n12 -> Forge otherwise\nIf your opponent get's 4+ lings, build 2 Cannons on 13 and then Nexus.","");
        PvZCenter99Gate = new Builds ("Center Two Gate", "P v Z", "6 -> Move Prove to the center of the map\n8 -> Pylon\n9 -> Gateway x2, Scout with the probe\n11 -> Zealot, Stop Probe Production\nContinue Zealot production while not getting supply blocked", "If your opponent already has lings by the time your first Zealot get's there, don't fight until you stack up 3 Zealots. Just prevent the opponent from building Sunkens and keep harassing.");
        ReaperDarkTemplar = new Builds ("Dark Templar Rush", "P v Z", "8 -> Pylon\n10 -> Gateway\n13 -> Zealot\n15 -> Pylon\n17 - Cybernetics Core\n18 -> Zealot\n22 -> Pylon, Dragoon\n@100% Cybernetics Core -> Citadel of Adun\n@100% Citdel of Adun -> Templar Archive, 2 x Gateway\n%100 Templar Archive -> Dark Templar x 3\n%100 3 x Dark Templars -> Push out\nKeep producing DTs/Zealots","If your opponent has only 1 sunken, chances are you are going to be able to end the game of do huge amount of damage. It doesn't matter if your opponent can see your DTs, they have high damage and you have Zealots to tank for them. Make sure you block lings from entering your base with the early 2 Zealots and you chase away the opponent's Overlord in your base with the Dragoon." );
        myBuildList.add(ReaperDarkTemplar);
        myBuildList.add(CorsairSpeedUpZealot);
        myBuildList.add(PowerDragoon);
        myBuildList.add(PvZCenter99Gate);
        myBuildList.add(PvZTips);

        //T v P

        FD = new Builds((String) context.getText(R.string.FD_BuildName), (String) context.getText(R.string.FD_BuildRace),  (String) context.getText(R.string.FD_BuildOrder), (String) context.getText(R.string.FD_BuildNotes));
        TwoFactory = new Builds((String) context.getText(R.string.TwoFactory_BuildName), (String) context.getText(R.string.TwoFactory_BuildRace),  (String) context.getText(R.string.TwoFactory_BuildOrder), (String) context.getText(R.string.TwoFactory_BuildNotes));
        BarrackDouble = new Builds ("One Barrack Double Command Center", "T v P", "9 -> Supply Depot\n11 -> Barracks at natural expansion\n16 -> Supply Depot at Expo\n100% Brracks -> Marine\n~20 -> Command Center\nGas, Bunker\nStop Marine production at 3-4 Marines\n100 Gas -> Factory", "Possibly the best opener for Terran. Safe against any build except for center Gateways from Protoss. Only thing you have to remember is to repair your bunker when range upgraded Dragoons attack it. You should repair with equal number of SCVs to the Dragoons that are attacking your Bunker. If the opponent doesn't have an expansion when you scout, build an Engineering Bay due to defend against DTs or Reavers. If not you can build an additional Factory instead and postpone your EB and Academy.");
        BBS = new Builds ("Barrack Barrack Supply (BBS)", "T v P", "6.5 -> Send SCV to Center of the map\n8 -> Sen SCV to Center of the map\nStop SCV production\n8 -> Barracks x 2 with the 2 SCVs in Center, 1 SCV\n9 -> Supply Depot\n100% Barracks -> Marines", "Early game finisher. Scout with your SCV after it finishes building the Barracks in the center. If you don't get scouted, you may want to wait until you get 5+ marines before you rush your enemy.");
        UpgradeTerran = new Builds ("Upgrade Terran", "T v P", "Choose one of the early game builds such as Barrack Double, Fake Double, or Factory Double\n100% Natural Expansion -> Gas at expo\nEngineering Bay/Academy if enemy is not expanding/2nd Factory otherwise\nArmory\nAdditional Factories + 3rd Command Center\n%100 Armory -> Mechanic Weapon Upgrade\n%33 Weapon Upgrade -> Star Port\nScience Facility, 2nd Armory\nContinue Upgrades and push out near completion of 3 Weapon + 2 Armor Upgrades", "Weapons upgrade for Terran is extremely powerful giving +5 for siege mode per level. This build is to utilize well timed continuous upgrades to get to 3 levels as fast as possible for the rush. When you scout, if the enemy toss is not building a Nexus, he might be preparing DTs or Reavers hence you should go for turrets and scan. If your opponent is continuously expanding, you should do the same and just defend against Recalls while you get your upgrades done and build up your army.");
        FactoryDouble = new Builds ("One Factory Double Command", "T v P", "9 -> Supply Depot\n12 -> Barracks\n12 -> Gas\n15 -> Supply Depot\n16 -> Factory\nCommand Center inside your base\n100% -> Command Center, fly it over to your natural. Use your Barracks to tighten your entrance","Standard opener for T v P. Safe against any most early game pressure.");
        OneFactoryStarport = new Builds("One Factory Star Port","T v P",STANDARD_TERRAN_OPENING+ "16 -> Factory\n20 -> Star Port\n100% Factory -> Addon, Mines Upgrade\n100% Star Port -> Addon, Drop ship\n4 Vulture Drop ","When the opponent is not expecting the drop, you will be able to do massive damage to the enemy's mineral line. Place mines near the enemy minerals and harass. If you do sufficient damage, build a second Factory and end the game. If you can't do enough damage, play defensively and expand preparing for mid-late game.");
        myBuildList.add(FD);
        myBuildList.add(BBS);
        myBuildList.add(UpgradeTerran);
        myBuildList.add(FactoryDouble);
        myBuildList.add(TwoFactory);
        myBuildList.add(BarrackDouble);
        myBuildList.add(OneFactoryStarport);

        //T v T
        BarrackDoubleTvT = new Builds("Barrack Double (TvT)", "T v T", "9 -> Supply Depot\n12 -> Barracks, Gas\n15 -> Supply Depot\n16 -> Marine\n17 -> Factory\n21 -> Command Center\n100% Factory -> Vulture -> Addon\n26 -> Factory\n100% Addon -> Tank\nArmory, Academy, Scan\n3rd Factory\nCommand Center","Standard opener in T v T which can stop most early game aggression from your opponent (except for BBS). In mid game, you want to continue expanding your territory while keeping your upgrades up and building up your Dropship count (essential in T v T).");
        FactoryDoubleTvT = new Builds("Factory Double (TvT)","T v T","\"9 -> Supply Depot\\n12 -> Barracks\\n12 -> Gas\\n15 -> Supply Depot\\n16 -> Factory\\nCommand Center inside your base\\n100% -> Command Center, fly it over to your natural. Use your Barracks to tighten your entrance\"","The build order is the exact same as the Factory Double build used in T v P. This is a little safer in early game since it can also handle BBS with some micro. However, this build loses to the One Barrack Double build.");
        BBSTvT = new Builds("BBS (TvT)", "T v T", "6.5 -> Send SCV to Center of the map\n8 -> Sen SCV to Center of the map\nStop SCV production\n8 -> Barracks x 2 with the 2 SCVs in Center, 1 SCV\n9 -> Supply Depot\n100% Barracks -> Marines", "Same build as T v P BBS. Early game all in with no turning back.");
        TvTNotes = new Builds("General Information (T v T)","T v T","The reason the build choices are a bit limited in T v T is because there is no real counter to Barracks Double or Factory Double in this match up. Builds such as Two Factory push or 2 Starport have been excluded from the current trends for this reason.","Weapon level 2 upgrade is essential in T v T since the opponent tanks die in 2 hits from yours. Since it is difficult to overwhelm a Terran with quantity of your units, you have to use Dropships to weaken enemy lines in the match up.");
        myBuildList.add(BarrackDoubleTvT);
        myBuildList.add(FactoryDoubleTvT);
        myBuildList.add(BBSTvT);
        myBuildList.add(TvTNotes);

        //T v Z
        FastEB = new Builds((String) context.getText(R.string.FirstEngineeringBay_BuildName), (String) context.getText(R.string.FirstEngineeringBay_BuildRace),  (String) context.getText(R.string.FirstEngineeringBay_BuildOrder), (String) context.getText(R.string.FirstEngineeringBay_BuildNotes));
        TwoBarracksAcademy  = new Builds("Two Barracks Academy", "T v Z", "9 -> Supply Depot\n11 -> Barrakcs\n13 -> Barracks\n14 -> Supply Depot\n18 -> Gas, Stop SCV Production\n20 -> Academy\n100% Academy -> Stim Pack, 2 Medic, 2 Firebat, Rush\nEngineering Bay\nTerran Bionic Weapons Upgrade","If you want to only pressure the Zerg and go to late game, take an expansion while you rush out, get marine range and tech up. If you want to attempt to end the game, add an additional barracks while you rush and keep producing units.");
        OneOneOne = new Builds ("One One One Build", "T v Z", STANDARD_TERRAN_OPENING + "17 -> Factory\n20 -> Command Center\n21 -> Factory Addon\n22 -> Starport, Supply Depot\n100% Addon -> Vulture, Mines\n%100 Starport -> Wraith, Starport Addon","The advantage of this build is that you can plant mines on all the expansions that the Zerg may go for very early. Because of the early Starport, you can also block Overlords from scouting your base while being able to scout the Zerg yourself. Also it is easy to fight off Mutalisks since you get your Science Vessels earlier than usual.");
        FiveBarrack = new Builds("5 Barracks Late Mechanic", "T v Z", "9 -> Supply Depot\n11 -> Barracks\n12 -> Scout\n18 -> Command Center\n21 -> Gas\nEngineering Bay, Supply Depot\nAcademy\n100% Academy -> Scan, Stimpack\nBarracks x 4 Marine and Medic production\nTurret to defend Mutalisks\nFactory after Mutas are cleared\nExpand while teching up", "Important to scout early to defend against speed up ling all in. Use mines to get vision and limit enemy movement. Attempt to delay Zerg's 3rd gas as much as possible.");
        TwoStarWraith = new Builds("Two Starport Wraith","T v Z","8 -> Supply Depot\n11 => Barracks\n12 -> Gas\n14 -> Supply Depot\n16 -> Factory\n100% Factory -> Vulture\nStarport\n50% Starport -> 2nd Starport\n100% 1st Starport -> Addon, Cloaking\n100% 2nd Starport -> Wraith","A build made famous by Leta. If the Zerg is unable to scout this, you will probably be able to do a lot of damage by hunting Overlords and Drones. Since there are a lot of varying situations while using this build, it is advised to watch old matches played by professionals to learn how to execute this build properly.");
        myBuildList.add(FastEB);
        myBuildList.add(TwoBarracksAcademy);
        myBuildList.add(OneOneOne);
        myBuildList.add(FiveBarrack);
        myBuildList.add(TwoStarWraith);

        //Z v P

        Overpool = new Builds((String) context.getText(R.string.Overpool_BuildName), (String) context.getText(R.string.Overpool_BuildRace),  (String) context.getText(R.string.Overpool_BuildOrder), "Standard opener against Toss. Can stop most early game all ins while having medium macro to prepare you for mid to late game.");
        TwelveHatchery = new Builds("12 Drone Expansion","Z v P", "9 -> Overlord\nDrone until 12\nHatchery at Expo\nSpawning Pool","The scout timing for a typical Protoss is after building his first Pylon. If he succeeds to find you in the first search, do not use this build since you will most likely get Cannon rushed or he will also go for a 12 Nexus which puts you at a disadvantage.");
        NineDroneSpeedvP = new Builds("9 Drone Speed Ling (Z v P)", "Z v P", "9 -> Spawning Pool\nDrone\nGas\nOverlord\nDrone\nZerglings x 6\nLing Speed Upgrade\nKeep producing lings while rushing","This is a semi all in build in this match up. If the enemy doesn't have his entrance blocked off properly, go straight into his main and start harassing. If things are going well, keep producing lings to end the game." );
        NineSevenThree = new Builds("973 Build", "Z v P", "9 -> Overlord, Spawning Pool\nDrone until 11\nHatchery at Expo\nZergling x 4\n14 -> Hatchery at Expo, Gas\n50 Gas -> Hydralisk Den\n9 Drones at Main, 7 Drones at 2nd Expo\n3 Drones at 3rd Expo\nHydralisks\nHydra Range Upgrade","This build allows you to be aggressive with the Hydras early game while also expanding your Hatchery count. When you have resources left over during the Hydra rush, build more Hatcheries and go for a Lair. If the opponent has less than 4 Cannons, you should be able to rush in with your Hydras and win the game.");
        TwoHatcheryHydra = new Builds("3 Hatchery Hydra", "Z v P", "9 -> Overlord\n12 -> Hatchery\n11 -> Spawning Pool\n10 -> Gas\n9 -> Drone x 3\n12 -> Zergling x 6\n50 Gas -> Hydralisk Den\n15 -> Overlord\n100% Hydralisk Den -> Hydra Range Upgrade", "Very strong all in build against Toss. Zealots are really weak until speed upgrade against Hydras with proper micro and if the opponent is not expecting this rush, most likely he will be caught off guard.");


        myBuildList.add(Overpool);
        myBuildList.add(TwelveHatchery);
        myBuildList.add(NineDroneSpeedvP);
        myBuildList.add(NineSevenThree);
        myBuildList.add(TwoHatcheryHydra);



        //Z v T


        NineDronevT = new Builds("9 Drone (Z v T)", "Z v T","9 -> Spawning Pool\nDrone\nOverlord\nZergling x 6\nHatchery","Kills opponent's early game all ins such as BBS and can kill greedy builds such as no Barracks double Command Center. An aggressive build relying on good ling micro in general.");
        NineDroneSpeed = new Builds("9 Drone Speed Ling", "Z v T", "9 -> Spawning Pool\nDrone\nGas\nOverlord\nDrone\nZerglings x 6\nLing Speed Upgrade\nKeep producing lings while rushing","Another killer to opponent all ins, but may put you in a very bad spot if you fail to end the game early" );
        OverpoolvT = new Builds("Overpool (Z v T)", "Z v T", "9 -> Overlord\nSpawning Pool\n12 -> Hatchery\nZerglings x 6", "Most commonly used build that is stable and can stop opponent all ins with proper micro. You must do damage to the opponent if he is being greedy early on, or you maybe at a disadvantage.");
        TwelveHatchvT = new Builds("12 Drone Expansion (Z v T)", "Z v T", "9 -> Overlord\nDrone until 12\nHatchery at Expo\nSpawning Pool","Loses to BBS due to lack of early game units. This build is a bit on the greedier side and thus when successful, you will find yourself in a good position for mid-late game");
        NoSpawning3Hatch = new Builds("No Spawning 3 Hatch", "Z v T", "9 -> Overlord\nDrone until 12\nHatchery at Expo\nDrone until 14\nHatchery at Main\nSpawning Pool\nGas","Greediest of greedy. If your opponent does not do any early game damage to you, you will be able to out macro them due to the amount of Larvas.");
        TwoHatchMuta = new Builds("Two Hatch Mutalisk", "Z v T", "Pick Overpool or 12 Drone Expansion\nLair when enough gas\n100% Lair -> Spire\nSave resources (600/600)\n100% Spire -> Muta x 6","2 Hatch builds are generally half all ins. You must do some form of damage to the opponent with the early Mutas or end the game. If you are forced into mid/late game, take an expansion and play defensively.");
        TwoHatchLurker = new Builds("Two Hatch Lurker", "Z v T", "Pick Overpool or 12 Drone Expansion\nLair when enough gas\n60% Lair -> Hydralisk Den\n100% Lair -> Lurker Upgrade, Spire (Fake)\n100% Spire -> Hydralisk x 6\nHydralisk -> Lurker\nBurrow at opponent natural","Even bigger all in than 2 Hatch Mutas. If your opponent knows about your Lurkers, you will most likely lose the game, thus it is very important to fake out your opponent and hide you Hydras.");
        ThreeHatch = new Builds("Three Hatch Mutalisk ", "Z v T","Pick Overpool or 12 Drone Expansion\nDrone Until 14\nHatchery at Main\nLair\nGas at Expo\n100% Lair -> Spire\nSave Resources (900/900)\n100% Spire -> Mutalisk x 9","Standard Muta build for the match up. Muta micro is very important as you have to use them to prevent Terran from rushing you by clipping off Marines. If you are overwhelmed by the number of Terran units, build Sunkens and play defensively while getting your Hive tech");

        myBuildList.add(NineDronevT);
        myBuildList.add(NineDroneSpeed);
        myBuildList.add(OverpoolvT);
        myBuildList.add(TwelveHatchvT);
        myBuildList.add(NoSpawning3Hatch);
        myBuildList.add(TwoHatchMuta);
        myBuildList.add(TwoHatchLurker);
        myBuildList.add(ThreeHatch);

        //Z v Z

        NineDrone = new Builds("9 Drone", "Z v Z", "9 -> Spawning Pool\nDrone\nGas\nOverlord\nDrone\nZergling x 6\nLing Speed Upgrade", "Wins Against:\n12 Drone Hatchery\nMain Base Twin Hatchery\n\nLoses Against:\nOverpool\n12 Pool\nFast Gas");
        OverpoolvZ = new Builds("Overpool (Z v Z)", "Z v Z", "9 -> Overlord\nSpawning Pool\nDrone until 12\nGas\nZerglings x 6\nLair\nHatchery","Wins Against:\n9 Drone\n\nLoses Against:\nFast Gas\n12 Pool\nFast Gas\nTwin Hatchery");
        FastGas = new Builds("Fast Gas","Z v Z","9 -> Overlord\nGas\nSpawning Pool\nDrone\nZerglings x 6\nLair\nHatchery","Wins Against:\n9 Drone\nOverpool\n\nLoses Against:\n12 Pool\nTwin Hatchery");
        TwelvePool = new Builds ("Twelve Pool", "Z v Z","9 -> Overlord\nDrone until 12\nSpawning Pool\nGas\nHatchery\nZerglings x 6\nLair","Wins Against:\n9 Drone\nFast Gas\nOverpool\n\nLoses Against:\n12 Drone Expansion");
        TwelveHatcheryvZ = new Builds ("12 Drone Expansion (Z v Z)", "Z v Z", "9 -> Overlord\nDrone until 12\nHatchery at main\nSpawning Pool\nDrone\nGas\nZergling x 6\nZergling Speed Upgrade","Wins Against:\nFast Gas\nMain Base Twin Hatchery\n12 Pool\n\nLoses Against:\n9 Drone");
        ZvZTips = new Builds("Z v Z Tips", "Z v Z", "Z v Z is a very fast paced match up utilizing Mutalisks and Scourges. After getting your Lair, build your Spire as soon as you get enough resources. Practice Muta and Scourge micro in some use maps for increased win rate!","N/A");

        myBuildList.add(NineDrone);
        myBuildList.add(OverpoolvZ);
        myBuildList.add(FastGas);
        myBuildList.add(TwelvePool);
        myBuildList.add(TwelveHatcheryvZ);
        myBuildList.add(ZvZTips);


        return myBuildList;

    }


}



