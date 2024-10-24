/* TinyBasicParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. TinyBasicParserTokenManager.java */
package fr.utbm.info.da53.lw2.parser;
import java.util.SortedMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import fr.utbm.info.da53.lw2.context.*;
import fr.utbm.info.da53.lw2.symbol.*;
import fr.utbm.info.da53.lw2.syntaxtree.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class TinyBasicParserTokenManager implements TinyBasicParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ff000L) != 0L)
         {
            jjmatchedKind = 5;
            return 1;
         }
         if ((active0 & 0xc00000L) != 0L)
            return 5;
         if ((active0 & 0xc000000L) != 0L)
            return 7;
         if ((active0 & 0x40000000L) != 0L)
            return 9;
         return -1;
      case 1:
         if ((active0 & 0x3ff000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x3f7000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x395000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x381000L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 7);
      case 34:
         return jjStartNfaWithStates_0(0, 30, 9);
      case 40:
         return jjStopAtPos(0, 28);
      case 41:
         return jjStopAtPos(0, 29);
      case 42:
         return jjStopAtPos(0, 10);
      case 43:
         return jjStopAtPos(0, 8);
      case 45:
         return jjStopAtPos(0, 9);
      case 47:
         return jjStopAtPos(0, 11);
      case 60:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 61:
         return jjStopAtPos(0, 24);
      case 62:
         jjmatchedKind = 27;
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x104000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x88000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x240000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(1, 26);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x242000L);
      case 70:
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 1);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0xa0000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x104000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 77:
      case 109:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         break;
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 84:
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x204000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 79:
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 1);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x380000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 84:
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 9;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 4)
                        kind = 4;
                     { jjCheckNAdd(0); }
                  }
                  else if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 9:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  else if (curChar == 34)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  { jjCheckNAdd(0); }
                  break;
               case 3:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               case 4:
                  if (curChar == 34 && kind > 6)
                     kind = 6;
                  break;
               case 5:
                  if (curChar == 62 && kind > 25)
                     kind = 25;
                  break;
               case 6:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 60 && kind > 25)
                     kind = 25;
                  break;
               case 8:
                  if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  { jjCheckNAdd(1); }
                  break;
               case 9:
               case 3:
                  { jjCheckNAddTwoStates(3, 4); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(3, 4); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\12", "\53", "\55", "\52", "\57", 
null, null, null, null, null, null, null, null, null, null, "\74", "\74\75", "\75", 
null, "\76\75", "\76", "\50", "\51", "\42", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public TinyBasicParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public TinyBasicParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 9; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7ffffff1L, 
};
static final long[] jjtoSkip = {
   0xeL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[9];
    private final int[] jjstateSet = new int[2 * 9];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
