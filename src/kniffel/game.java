package kniffel;

public class game {
	public static void start() {
		int players = IO.inquireInt("How many players do want to play? It defaults to one");
		int turns = IO.inquireInt("How many turns do you want to play? It defaults to one");
		int rolled = 0;
		dice bd = new dice();
		for (int t = 1; t <= turns; t++) {
			for (int p = 1; p <= players; p++)

			{
				IO.informTurn(p, t);
				do {

					if (rolled == 0) {
						bd.fiveDSix();;
						IO.informRoll(p, bd, 'i');
					}
					rolled++;
					char rr = IO.inquireAction();
					if (rr == 'f') {
						System.out.println("Filling code not yet here");
						rolled = 3;
					} else if (rr == 'r') {
						int[] dicetoreroll = IO.inquireReroll(bd);
						bd.reroll(dicetoreroll, 6);
						IO.informRoll(p, bd, 'r');

					}

				} while (rolled < 3);
				rolled = 0;
			}
		}

	};
}
