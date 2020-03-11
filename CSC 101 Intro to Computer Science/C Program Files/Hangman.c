/* Program: Hangman
   By: Kevin Harper     Date: Aug 05, 2011 */

#include <stdio.h>
#include <string.h>

/* contant declarations */
#define NUM_TRIES_ALLOWED 7

/* function prototypes */
void clrscrn( void );
void draw_hangman( int incorrect_tries );

main()
{
   /* variable declarations */
   int num_letters       = 0, /* length of word char array */
       count             = 0, /* for word char array       */
       tries             = 0, /* total tries user has used */
       num_vis_chars     = 0, /* # of visible characters   */
       correct_guesses   = 0, /* # of correct guesses      */
       correct_flag      = 0, /* was guess correct?        */
       repeat_flag       = 0; /* was guess a repeat?       */

   char guess;

   /* array declarations */
   char word[255]              = " ";
   char hint[255]              = " ";
   char incorrect_letters[255] = " ";

   /* get word */
   puts( "Enter a word for player to guess." );
   gets( word );

   puts( "Give the player a very short hint." );
   gets( hint );

   num_letters = strlen( word );
   char visible_word[num_letters]; /* displays correct guesses */

   /* initialize visble_word */
   for( count = 0; count < num_letters; count++ )
      visible_word[count] = '-';

   visible_word[num_letters] = '\0';

   clrscrn();
   puts( "\nHANGMAN" );
   printf( "HINT: %s", hint );
   draw_hangman( tries );

   while( tries < NUM_TRIES_ALLOWED )
   {
      printf( "WORD: %s\n", visible_word );
      printf( "Incorrect Guesses: %s\n", incorrect_letters );
      printf( "\nGuess a letter (and press 'Enter'): " );
      scanf( " %c", &guess );

      /* match guess against previous guesses */
      for( count = 0; count < num_letters; count++ )
         if( guess == visible_word[count] || guess == incorrect_letters[count] )
         {
            repeat_flag  = 1;
            correct_flag = 1;
            break;
         }

      if( repeat_flag == 0 )
         /* check for matches in string */
         for( count = 0; count < num_letters; count++ )
         {
            if( guess == word[count] )
            {
               visible_word[count] = guess;
               correct_guesses++;

               if( correct_guesses == num_letters )
               {
                  puts( "\n\nCONGRATULATIONS! You guessed the word!" );
                  printf( "WORD: %s\n\n", visible_word );
                  exit( 0 );
               }

               correct_flag = 1;
            }
         }

      if( correct_flag == 0 )
      {
         incorrect_letters[tries] = guess;
         tries++;
      }

      /* reset flags */
      repeat_flag  = 0;
      correct_flag = 0;

      clrscrn();
      puts( "\nHANGMAN" );
      printf( "HINT: %s", hint );
      draw_hangman( tries );
   }

   puts( "You did not guess the word." );
   printf( "WORD: %s\n\n", visible_word );

   return 0;
}

/* clrscrn() clears the screen */
void clrscrn( void )
{
   int x = 0;

   for( x = 0; x < 20; x++ )
      printf( "\n" );
}

/* draw_hangman() displays the hangman */
void draw_hangman( int incorrect_tries )
{
/*
 ___
 |  &
 |  O
 | /|\
 | / \
 |
---
*/

   switch( incorrect_tries )
   {
      default:
      {
         puts( "\n  ___" );
         puts( " |" );
         puts( " |" );
         puts( " |" );
         puts( " |" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 1:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |" );
         puts( " |" );
         puts( " |" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 2:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |  O" );
         puts( " |" );
         puts( " |" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 3:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |  O" );
         puts( " | /" );
         puts( " |" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 4:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |  O" );
         puts( " | /|" );
         puts( " |" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 5:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |  O" );
         puts( " | /|\\" );
         puts( " |" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 6:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |  O" );
         puts( " | /|\\" );
         puts( " | /" );
         puts( " |" );
         puts( "---" );
         break;
      }

      case 7:
      {
         puts( "\n  ___" );
         puts( " |  &" );
         puts( " |  O" );
         puts( " | /|\\" );
         puts( " | / \\" );
         puts( " |" );
         puts( "---" );
         break;
      }
   }
}
