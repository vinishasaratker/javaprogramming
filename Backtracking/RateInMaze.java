public class RateInMaze
{
void helper(vector<vector<int>>&mat,int r,int c,String path ,vecor<String>&ans){
        int n=mat.size();
        if(r<0|| c<0 || c>=n ||mat[r][c]==-1){
            return ;
        }

        if(r==1 && c==n-1){
            ans.push_back(path);
            return ;
        }
        mat[r][c]=-1;
        helper(mat,r+1,c,path+"D",ans);// down
        helper(mat,r+1,c,path+"D",ans);//up
        helper(mat,r+1,c,path+"D",ans);//left
        helper(mat,r+1,c,path+"D",ans);//right
        mat[r][c]=1 ;
     }  
     
     // complete this  function 
     vector<String>findPath(vector<vector<int>>&mat){
        int n=mat.size();
        vector<String>ans ;
        String path="";
        vector<vector<bool>>vis(n,vector<bool>(n,false));
        helper(mat,0,0,path,ans,vis);
        return ans;
     }


 
    public static void main(String[] args) {
     
vector<vector<int>> mat={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};;

    }
}
