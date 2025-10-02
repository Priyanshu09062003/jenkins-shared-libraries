def call(String url , String branch){
  echo 'This is cloning of code'
  git url: "${url}" , branch:"${branch}"
  echo "code cloning successfully"

}
