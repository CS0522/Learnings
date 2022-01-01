#include <iostream>
#include <math.h>
#include <time.h>

#define M 10

using namespace std;

class Solution
{
    private:
    double matrix[M][M]; //store the initial matrix A and l and u.
    double index_u;
    double index_l;
    double vector_b[M]; //the b vector in Ax = b.
    double vector_temp[M]; //temp vector for y and x.

    public:
    void initial(); // initial matrix A.
    void function(); 
    void display();
    void get_x();
    void get_y();
    void result();

};

void Solution::initial()
{
    srand(time(0));

    //initial matrix A and vector b.
    for (int i=0;i<M;i++)
    {
        vector_b[i] = rand()%10;
    }
    for (int i=0;i<M;i++)
    {
        for (int j=0;j<M;j++)
        {
            matrix[i][j] = rand()%10;
        }
    }
}

void Solution::function()
{
    //calculate by column
    //first calculate the u in a column, and then calclulate the l in the same column.
    for (int j=1;j<=M;j++)
    {
        for (int i=1;i<=M;i++)
        {
            if (i <= j)
            {
                double index_value = 0;
                for (int k=1;k<i-1;k++)
                {
                    index_value = index_value + matrix[i-1][k-1]*matrix[k-1][j-1];
                }
                index_u = matrix[i-1][j-1] - index_value;
                matrix[i-1][j-1] = index_u; //exchange 'a' of the initial matrix A with 'u'.
            }
            else 
            {
                double index_value = 0;
                for (int k=1;k<j-1;k++)
                {
                    index_value = index_value + matrix[i-1][k-1]*matrix[k-1][i-1];
                }
                index_l = (matrix[i-1][j-1] - index_value)/matrix[j-1][j-1];
                matrix[i-1][j-1] = index_l; //exchange 'a' of the initial matrix A with 'l'.
            }
        }
    }
}

void Solution::display()
{
    cout<<"Matrix L: "<<endl;
    for (int i=0;i<M;i++)
    {
        for (int j=0;j<M;j++)
        {
            if (i > j)
            {
                cout.width(12);
                cout<<matrix[i][j];
            }
            else if (i == j)
            {
                cout.width(12);
                cout<<"1";
            }
            else
            {
                cout.width(12);
                cout<<"0";
            }
        }
        cout<<endl;
    }

    cout<<endl;

    cout<<"Matrix U: "<<endl;
    for (int i=0;i<M;i++)
    {
        for (int j=0;j<M;j++)
        {
            if (i > j)
            {
                cout.width(12);
                cout<<"0";
            }
            else
            {
                cout.width(12);
                cout<<matrix[i][j];
            }
        }
        cout<<endl;
    }
}

void Solution::get_y()
{
    //get vector y.
    //order: y1 to ym.
    //from the first row to the last row.
    for (int i=0;i<M;i++)
    {
        int temp = 0;
        for (int j=0;j<i;j++)
        {
            temp = temp + matrix[i][j]*vector_temp[j];
        }
        vector_temp[i] = vector_b[i] - temp;
    }
}

void Solution::get_x()
{
    //get vector x.
    //order: xm to x1.
    //from the last row to the first row.
    for (int i=M-1;i>=0;i--)
    {
        int temp = 0;
        for (int j=i+1;j<M;j++)
        {
            temp = temp + matrix[i][j]*vector_temp[j];
        }
        vector_temp[i] = (vector_temp[i] - temp)/matrix[i][i];
    }
}

void Solution::result()
{
    cout<<endl;
    cout<<"x: "<<endl;
    for (int i=0;i<M;i++)
    {
        cout<<"x";
        cout.width(2);
        cout<<i+1<<" = ";
        cout.width(8);
        cout<<vector_temp[i]<<endl;
    }
}

int main()
{
    Solution obj;
    obj.initial();
    obj.function();
    obj.display();
    obj.get_y();
    obj.get_x();
    obj.result();
    system("pause");
    return 0;
}