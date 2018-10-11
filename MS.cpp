#include <iostream>
#include <math.h>
using namespace std;
void Divide(int a[],int,int);
void Sort(int a[],int,int,int);

int main() {
int n,i;
cin>>n;
int a[n];
for(i=0;i<n;i++)
{
    cin>>a[i];
}


int j=0,k=n-1;
Divide(a,j,k);

for(i=0;i<n;i++)
{
    cout<<a[i]<<" ";
}
    return 0;
}


void Divide(int a[],int j,int k)
{
    if(j<k)
    {
    int l=floor((j+k)/2);
    Divide(a,j,l);
    Divide(a,l+1,k);
    Sort(a,j,k,l);
    }
   
   
   
}
void Sort(int a[],int j,int k,int l)
{
    int m=0;
    int T[k+1];
    int v=l+1;
   
    while(j<=l && v<=k)
    {
        if(a[j]<=a[v])
        {
            T[m++]=a[j++];
        }
        else
        {
            T[m++]=a[v++];
        }
    }
    while(j<=l)
    {
        T[m++]=a[j++];
    }
    while(v<=k)
    {
        T[m++]=a[v++];
    }

    for(int i=0;i<m;i++)
	{
	a[i]=T[i];
	}
}


