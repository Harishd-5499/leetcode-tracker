// Last updated: 7/9/2026, 9:11:59 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int startColor = image[sr][sc];
        dfs(image, sr, sc, startColor, color);
        return image;
    }
    private void dfs(int[][] image, int r, int c, int startColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) {
            return;
        }
        if (image[r][c] != startColor) {
            return;
        }
        image[r][c] = newColor;
        dfs(image, r + 1, c, startColor, newColor); 
        dfs(image, r - 1, c, startColor, newColor); 
        dfs(image, r, c + 1, startColor, newColor); 
        dfs(image, r, c - 1, startColor, newColor);
    }
}