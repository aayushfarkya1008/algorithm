#include <iostream>
#include <algorithm> // for lower_bound, upper_bound and sort
#include <vector>    // for vector

using namespace std;
 int match(string T,string P,int g,int m)
        {     
           
                int res=1;
                for(int k=0;k<m;k++)
                {
                        if(T[g+k]!=P[k])
                        {
                           
                            res=0;
                        }
                }
 return res;
        }

int main()
{
int hash=0;
string P;
getline(cin,P);
int m=P.length();
string T;
getline(cin,T);
int n=T.length();
        int prime=3,j;
        for(int h=0;h<m;h++)
        {
               
                hash=hash+(P[h]-97+1)*pow(prime,h);
        }
        //cout<<hash<<endl;
        int buff=0,g=0,res=0;


          for(int j=0;j<m;j++)
          {
                buff=buff+(T[g+j]-97+1)*pow(prime,j);
          }
          
          if(buff==hash)
          {
                res=match(T,P,0,m);
                if(res==1)
                {
                    cout<<"Value of Index is 0"  ;
                }
          }
       
    
        if(res==0)
        {
          
           
                for(g=1;g<n-m+1;g++)
                {
                   
                    buff=buff-(T[g-1]-97+1);
                
                    buff=buff/prime;
                   
                    buff=buff+(T[g+m-1]-97+1)*pow(prime,m-1);
                   
                    if(hash==buff)
                   {
                      
                     res=match(T,P,g,m);
                    
                     if(res==1)
                     {
                         break;
                     }
                    }
                }
               
             
             
               
        }
       
       
       
        if(res==1)
        {
        cout<<"value of g is :"<<g;
        }
       else
       {
           cout<<"String not matched";
       }
       
return 0;
}


