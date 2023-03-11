
    public class Print {
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;
        
        public Print(int tonerLevel,boolean duplex){
            this.tonerLevel=tonerLevel >= 0 ? tonerLevel <=100 ? tonerLevel : -1 :-1;
            this.duplex=duplex;
            this.pagesPrinted=0;
        } 
        public int addToner(int tonerAmount){
            if (tonerAmount>0 && tonerAmount<=100){
                if(tonerLevel>=100){
                    return -1;
                }else{
                    tonerLevel=tonerLevel+tonerAmount;
                }
            }else{
                return -1;
            }
            return  tonerLevel;
            
        }
        public int printPages(int pages){
            int pagesToPrint=pages;
            if (duplex){
                System.out.println("Printing in duplex mode");
                if (pages%2==0){
                    pagesToPrint=pagesToPrint/2;
                }
                else{
                    pagesToPrint=pagesToPrint/2;
                    pagesToPrint=pagesToPrint+1;
                }
            }
            pagesPrinted=pagesPrinted+ pagesToPrint;
            return pagesToPrint;
        }
        public int getPagesPrinted(){
            return pagesPrinted;
        }
        public int getTonerLevel(){
            return tonerLevel;
        }
    }

