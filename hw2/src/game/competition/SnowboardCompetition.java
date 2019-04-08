package game.competition;

import game.arena.IArena;
import game.enums.Discipline;
import game.enums.Gender;
import game.enums.League;

public class SnowboardCompetition extends WinterCompetition {
	
	public SnowboardCompetition(IArena arena,int maxCompetitors, Discipline discipline, League league, Gender gender) {
		super(arena, maxCompetitors, discipline, league, gender);
	}

}
