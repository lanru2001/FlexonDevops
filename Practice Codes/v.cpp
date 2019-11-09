#include <iostream>
using namespace std;
int* cellCompete(int* cells,int days)
{
    for(int j=0; j<days; j++)
    {
        int copy_cells[10];
        for(int i=1; i<9; i++)
            copy_cells[i]=cells[i-1];

        copy_cells[0]=0;copy_cells[9]=0;
        for(int i=0; i<8; i++)
            cells[i]=copy_cells[i]==copy_cells[i+2]?0:1;
    }
    return cells;
}

int main()
{
    int arr[8]={1,1,1,0,1,1,1,1};
    int arr2[8]={1,0,0,0,0,1,0,0};
    cellCompete(arr2,1);
    for(int i=0; i<8; i++)
        cout<<arr2[i]<<" ";
}