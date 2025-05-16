package ConduitAPI;

public class ArticleRequest {
	
	//POJO for Outer Wrapper – ArticleRequest
	
	public Article article;
	
	public ArticleRequest(Article article) {
		this.article=article;
		
	}
	
	public Article getArticle() {
		return article;
	}
	
	public void setArticle(Article article) {
		this .article=article;
	}

}
