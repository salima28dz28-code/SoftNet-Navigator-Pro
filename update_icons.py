import os
from PIL import Image
import shutil

logo_path = 'logo.png'
res_dir = 'SoftNet_Navigator_Pro/res'

sizes = {
    'mipmap-mdpi': 48,
    'mipmap-hdpi': 72,
    'mipmap-xhdpi': 96,
    'mipmap-xxhdpi': 144,
    'mipmap-xxxhdpi': 192
}

try:
    img = Image.open(logo_path)
    
    # Create drawable-nodpi if it doesn't exist
    drawable_dir = os.path.join(res_dir, 'drawable-nodpi')
    if not os.path.exists(drawable_dir):
        os.makedirs(drawable_dir)
        
    # Copy logo.png to drawable-nodpi
    shutil.copy(logo_path, os.path.join(drawable_dir, 'logo.png'))
    print("Copied logo to drawable-nodpi/logo.png")

    # Resize and save for each mipmap folder
    for folder, size in sizes.items():
        folder_path = os.path.join(res_dir, folder)
        if not os.path.exists(folder_path):
            os.makedirs(folder_path)
        
        resized_img = img.resize((size, size), Image.Resampling.LANCZOS)
        out_path = os.path.join(folder_path, 'icon.png')
        resized_img.save(out_path)
        print(f"Saved {out_path}")
        
except Exception as e:
    print(f"Error: {e}")
