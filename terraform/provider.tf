provider "aws" {
  region = "ap-northeast-2"
  default_tags {
    tags = {
      Name        = "terraform-secretmanager-test"
      Environment = "dev"
    }
  }
}
