resource "aws_secretsmanager_secret" "dev" {
  name                    = "/secret/dev"
  description             = "dev"
  recovery_window_in_days = 0
}

resource "aws_secretsmanager_secret_version" "dev" {
  secret_id     = aws_secretsmanager_secret.dev.id
  version_stages = ["0.0.2", "0.0.3"]
  secret_string = <<EOF
  {
    "USERNAME": "user",
    "PASSWORD": "${var.password}"
  }
  EOF
}
