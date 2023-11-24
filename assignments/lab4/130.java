class Solution {
    public void dfs(int i,int j,int n,int m,char board[][]){
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!='O'){
            return;
        }
        board[i][j]='*';
        dfs(i-1,j,n,m,board);
        dfs(i+1,j,n,m,board);
        dfs(i,j-1,n,m,board);
        dfs(i,j+1,n,m,board); 
      

    }
    public void solve(char[][] board) {
        int n=board.length;
        int m =board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i*j==0 || i==n-1 || j==m-1 ){
                    if(board[i][j]=='O'){
                        dfs(i,j,n,m,board);
                    }
                }
                
            }
        
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')
                board[i][j]='X';
                if(board[i][j]=='*')
                board[i][j]='O';
            }
        }

    }
}