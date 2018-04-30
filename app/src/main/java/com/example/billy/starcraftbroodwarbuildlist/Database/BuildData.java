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



        //T v Z
        FastEB = new Builds((String) context.getText(R.string.FirstEngineeringBay_BuildName), (String) context.getText(R.string.FirstEngineeringBay_BuildRace),  (String) context.getText(R.string.FirstEngineeringBay_BuildOrder), (String) context.getText(R.string.FirstEngineeringBay_BuildNotes));
        TwoBarracksAcademy  = new Builds("Two Barracks Academy", "T v Z", "9 -> Supply Depot\n11 -> Barrakcs\n13 -> Barracks\n14 -> Supply Depot\n18 -> Gas, Stop SCV Production\n20 -> Academy\n100% Academy -> Stim Pack, 2 Medic, 2 Firebat, Rush\nEngineering Bay\nTerran Bionic Weapons Upgrade","If you want to only pressure the Zerg and go to late game, take an expansion while you rush out, get marine range and tech up. If you want to attempt to end the game, add an additional barracks while you rush and keep producing units.");
        OneOneOne = new Builds ("One One One Build", "T v Z", STANDARD_TERRAN_OPENING + "17 -> Factory\n20 -> Command Center\n21 -> Factory Addon\n22 -> Starport, Supply Depot\n100% Addon -> Vulture, Mines\n%100 Starport -> Wraith, Starport Addon","The advantage of this build is that you can plant mines on all the expansions that the Zerg may go for very early. Because of the early Starport, you can also block Overlords from scouting your base while being able to scout the Zerg yourself. Also it is easy to fight off Mutalisks since you get your Science Vessels earlier than usual.");
        FiveBarrack = new Builds("5 Barracks Late Mechanic", "T v Z", "9 -> Supply Depot\n11 -> Barracks\n12 -> Scout\n18 -> Command Center\n21 -> Gas\nEngineering Bay, Supply Depot\nAcademy\n100% Academy -> Scan, Stimpack\nBarracks x 4 Marine and Medic production\nTurret to defend Mutalisks\nFactory after Mutas are cleared\nExpand while teching up", "Important to scout early to defend against speed up ling all in. Use mines to get vision and limit enemy movement. Attempt to delay Zerg's 3rd gas as much as possible.");
        myBuildList.add(FastEB);
        myBuildList.add(TwoBarracksAcademy);
        myBuildList.add(OneOneOne);
        myBuildList.add(FiveBarrack);
        //Z v P
        Overpool = new Builds((String) context.getText(R.string.Overpool_BuildName), (String) context.getText(R.string.Overpool_BuildRace),  (String) context.getText(R.string.Overpool_BuildOrder), (String) context.getText(R.string.Overpool_BuildNotes));
        myBuildList.add(Overpool);
        //Z v T
        //Z v Z





        return myBuildList;

    }


}



