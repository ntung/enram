package nl.esciencecenter.ncradar;

public class JNIMethodsVol2Bird {

    static {
        System.loadLibrary("calctexture");
        System.loadLibrary("findcells");
        }
         
    // Declare native methods
    final native static int[] calcTexture(int tMissing, int tnAzim, int tnRange, double tOffset, double tScale,
                            int[] vImage, int vMissing, int vnAzim, int vnRange, double vOffset, double vScale,
                            int[] zImage, int zMissing, int znAzim, int znRange, double zOffset, double zScale,
                            int nRangLocal, int nAzimLocal, int nCountMin, int textype);
    
    final native static int[] findCells(int[] cellImage, 
            int[] texImage, int texnRang, int texnAzim, double texOffset, double texScale, int texMissing, double texThresMin, 
            int[] rhoImage, int rhonRang, int rhonAzim, double rhoOffset, double rhoScale, int rhoMissing, double rhoThresMin,
            int[] zdrImage, int zdrnRang, int zdrnAzim, double zdrOffset, double zdrScale, int zdrMissing, double zdrThresMin, 
            double dbzmin, double rcellmax, int sign, double texrScale);
    
}
