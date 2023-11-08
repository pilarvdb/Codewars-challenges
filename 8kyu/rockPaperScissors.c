// Rock Paper Scissors
// Let's play! You have to return which player won! In case of a draw return Draw!.

// Examples(Input1, Input2 --> Output):

// "scissors", "paper" --> "Player 1 won!"
// "scissors", "rock" --> "Player 2 won!"
// "paper", "paper" --> "Draw!"

///////////////////////////////////////////////////////////////////////////////////////////////////////////
// My solution
//////////////////////////////////////////////////////////////////////////////////////////////////////////
enum tool {ROCK, PAPER, SCISSORS};
enum outcome {P1_WON, P2_WON, DRAW};

enum outcome rps (enum tool p1, enum tool p2)
{
  if (p1 == p2){
	  return DRAW;
    }
  if (p1 == ROCK){
    if (p2 == PAPER){
      return P2_WON;
    }
    else{
      return P1_WON;
    }
  }
  if (p1 == PAPER){
    if (p2 == ROCK){
      return P1_WON;
    }
    else {
      return P2_WON;
    }
  }
  else {
    if (p2 == ROCK){
      return P2_WON;
    }
    else{
      return P1_WON;
    }
  }
}

// test