package grammar; 
import java.util.*;
import entity.*;

%% 

%{
	  
    public static ArrayList<token> tokens = new ArrayList<>();
    public SymbolTable st = new SymbolTable();

    public static void printTokens() {
		System.out.println("===================================================");
		for (token node : tokens) {
			System.out.format("%-5s%-15s%-15s%-15s%-5s\n", "<",node.getTokenType(), ":" ,node.getToken(),">");
		}
		System.out.println("===================================================");
	}

%}

%public 
%class myLexer 
%type Void 

InputChar  = [^\n\r]
SpaceChar  = [\ \t]
LineChar  = \n|\r|\r\n 
letter = [A-Za-z] 
newline = \r|\n|\r\n 

id  = [A-Za-z_$] [A-Za-z_$0-9]*

 
Integer   = ( 0 | [1-9][0-9]* | 0[0-7]+ | 0[xX][0-9a-fA-F]+ )[lL]? 

El  = [eE] [\+\-]? [0-9]+ 

Float   = ( [0-9]+ \. [0-9]+ {El}? | \. [0-9]+ {El}?  | [0-9]+ \. {El}? | [0-9]+ {El}  ) [fFdD]? | [0-9]+ [fFDd]

%% 
//{letter}+  { tokens.add(new token("id", yytext()));} 








and                    {tokens.add(new token("keyword", yytext()));}
and_eq                 {tokens.add(new token("keyword", yytext()));}
asm                    {tokens.add(new token("keyword", yytext()));}
auto                   {tokens.add(new token("keyword", yytext()));}
bitand                 {tokens.add(new token("keyword", yytext()));}
bitor                  {tokens.add(new token("keyword", yytext()));}
bool                   {tokens.add(new token("keyword", yytext()));}
break                  {tokens.add(new token("keyword", yytext()));}
case                   {tokens.add(new token("keyword", yytext()));}
catch                  {tokens.add(new token("keyword", yytext()));}
char                   {tokens.add(new token("keyword", yytext()));}
class                  {tokens.add(new token("keyword", yytext()));}
compl                  {tokens.add(new token("keyword", yytext()));}
const                  {tokens.add(new token("keyword", yytext()));}
const_cast             {tokens.add(new token("keyword", yytext()));}
continue               {tokens.add(new token("keyword", yytext()));}
default                {tokens.add(new token("keyword", yytext()));}
delete                 {tokens.add(new token("keyword", yytext()));}
do                     {tokens.add(new token("keyword", yytext()));}
double                 {tokens.add(new token("keyword", yytext()));}
dynamic_cast           {tokens.add(new token("keyword", yytext()));}
else                   {tokens.add(new token("keyword", yytext()));}
enum                   {tokens.add(new token("keyword", yytext()));}
explicit               {tokens.add(new token("keyword", yytext()));}
export                 {tokens.add(new token("keyword", yytext()));}
extern                 {tokens.add(new token("keyword", yytext()));}
float                  {tokens.add(new token("keyword", yytext()));}
for                    {tokens.add(new token("keyword", yytext()));}
friend                 {tokens.add(new token("keyword", yytext()));}
goto                   {tokens.add(new token("keyword", yytext()));}
if                     {tokens.add(new token("keyword", yytext()));}
inline                 {tokens.add(new token("keyword", yytext()));}
int                    {tokens.add(new token("keyword", yytext()));}
long                   {tokens.add(new token("keyword", yytext()));}
mutable                {tokens.add(new token("keyword", yytext()));}
namespace              {tokens.add(new token("keyword", yytext()));}
new                    {tokens.add(new token("keyword", yytext()));}
not                    {tokens.add(new token("keyword", yytext()));}
not_eq                 {tokens.add(new token("keyword", yytext()));}
operator               {tokens.add(new token("keyword", yytext()));}
or                     {tokens.add(new token("keyword", yytext()));}
or_eq                  {tokens.add(new token("keyword", yytext()));}
private                {tokens.add(new token("keyword", yytext()));}
protected              {tokens.add(new token("keyword", yytext()));}
public                 {tokens.add(new token("keyword", yytext()));}
register               {tokens.add(new token("keyword", yytext()));}
reinterpret_cast       {tokens.add(new token("keyword", yytext()));}
return                 {tokens.add(new token("keyword", yytext()));}
short                  {tokens.add(new token("keyword", yytext()));}
signed                 {tokens.add(new token("keyword", yytext()));}
sizeof                 {tokens.add(new token("keyword", yytext()));}
static                 {tokens.add(new token("keyword", yytext()));}
static_cast            {tokens.add(new token("keyword", yytext()));}
struct                 {tokens.add(new token("keyword", yytext()));}
switch                 {tokens.add(new token("keyword", yytext()));}
template               {tokens.add(new token("keyword", yytext()));}
this                   {tokens.add(new token("keyword", yytext()));}
throw                  {tokens.add(new token("keyword", yytext()));}
try                    {tokens.add(new token("keyword", yytext()));}
typedef                {tokens.add(new token("keyword", yytext()));}
typeid                 {tokens.add(new token("keyword", yytext()));}
typename               {tokens.add(new token("keyword", yytext()));}
union                  {tokens.add(new token("keyword", yytext()));}
unsigned               {tokens.add(new token("keyword", yytext()));}
using                  {tokens.add(new token("keyword", yytext()));}
virtual                {tokens.add(new token("keyword", yytext()));}
void                   {tokens.add(new token("keyword", yytext()));}
volatile               {tokens.add(new token("keyword", yytext()));}
wchar_t                {tokens.add(new token("keyword", yytext()));}
while                  {tokens.add(new token("keyword", yytext()));}
xor                    {tokens.add(new token("keyword", yytext()));}
xor_eq                 {tokens.add(new token("keyword", yytext()));}
false                  {tokens.add(new token("keyword", yytext()));}
true                   {tokens.add(new token("keyword", yytext()));}


cin         {tokens.add(new token("PredefIdent", yytext()));}
endl        {tokens.add(new token("PredefIdent", yytext()));}
INT_MIN     {tokens.add(new token("PredefIdent", yytext()));}
iomanip     {tokens.add(new token("PredefIdent", yytext()));}
main        {tokens.add(new token("PredefIdent", yytext()));}
npos        {tokens.add(new token("PredefIdent", yytext()));}
std         {tokens.add(new token("PredefIdent", yytext()));}
cout        {tokens.add(new token("PredefIdent", yytext()));}
include     {tokens.add(new token("PredefIdent", yytext()));}
INT_MAX     {tokens.add(new token("PredefIdent", yytext()));}
iostream    {tokens.add(new token("PredefIdent", yytext()));}
MAX_RAND    {tokens.add(new token("PredefIdent", yytext()));}
NULL        {tokens.add(new token("PredefIdent", yytext()));}
string      {tokens.add(new token("PredefIdent", yytext()));}



"("                     {tokens.add(new token("symbol", yytext()));}
")"                     {tokens.add(new token("symbol", yytext()));}
"["                     {tokens.add(new token("symbol", yytext()));}
"]"                     {tokens.add(new token("symbol", yytext()));}
"{"                     {tokens.add(new token("symbol", yytext()));}
"}"                     {tokens.add(new token("symbol", yytext()));}
"%"                     {tokens.add(new token("symbol", yytext()));}
"&&"                    {tokens.add(new token("symbol", yytext()));}
"||"                    {tokens.add(new token("symbol", yytext()));}
"++"                    {tokens.add(new token("symbol", yytext()));}
"--"                    {tokens.add(new token("symbol", yytext()));}
"!"                     {tokens.add(new token("symbol", yytext()));}
">"                     {tokens.add(new token("symbol", yytext()));}
"<"                     {tokens.add(new token("symbol", yytext()));}
">="                    {tokens.add(new token("symbol", yytext()));}
"=>"                    {tokens.add(new token("symbol", yytext()));}
"<="                    {tokens.add(new token("symbol", yytext()));}
"<<"                    {tokens.add(new token("symbol", yytext()));}
">>"                    {tokens.add(new token("symbol", yytext()));}
"=<"                    {tokens.add(new token("symbol", yytext()));}
"=="                    {tokens.add(new token("symbol", yytext()));}
"*="                    {tokens.add(new token("symbol", yytext()));}
"+="                    {tokens.add(new token("symbol", yytext()));}
"-="                    {tokens.add(new token("symbol", yytext()));}
"\/="                   {tokens.add(new token("symbol", yytext()));}
";"                     {tokens.add(new token("symbol", yytext()));}
","                     {tokens.add(new token("symbol", yytext()));}
"\""                    {tokens.add(new token("symbol", yytext()));}
"\'"                    {tokens.add(new token("symbol", yytext()));}
"+"                     {tokens.add(new token("symbol", yytext()));}
"-"                     {tokens.add(new token("symbol", yytext()));}
"*"                     {tokens.add(new token("symbol", yytext()));}
"\/"                    {tokens.add(new token("symbol", yytext()));}
"\\"                    {tokens.add(new token("symbol", yytext()));}
"="                     {tokens.add(new token("symbol", yytext()));}
"#"                     {tokens.add(new token("symbol", yytext()));}




{Integer}     { tokens.add(new token("Integer", yytext())); } 
{Float}       { tokens.add(new token("Float", yytext())); } 

{id}          { tokens.add(new token("id", yytext(), this.st)); } 
 

"\""{InputChar}*"\"" 	{ tokens.add(new token("String", yytext()));} 

{newline}  { } 
"//"{InputChar}* { } 
"/*"~"*/"  { } 
{SpaceChar} { }
.   { throw new Exception("Unusual Lexeme ("+ yytext()+ ") found");} 